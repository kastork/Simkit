package simkit.viskit;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * An implementation of the TableModel interface for the parameters.
 * This feeds the parameters table GUI with assorted information on
 * how many columns, how to fill in data, etc.
 *
 * @author DMcG
 */

 public class ParameterTableModel extends AbstractTableModel
 {
   /** Number of columns in the table */
   private static final int PARAMETER_COLUMNS = 2;

   private static final int NAME_COLUMN          = 0;
   private static final int TYPE_COLUMN          = 1;

   /** Vector that holds data to be displayed */
   private Vector tableData;

   /**
    * Constructor that adds some bogus data for testing purposes
    */
   public ParameterTableModel()
   {
     tableData = new Vector();

     tableData.add(new Parameter("Randomvariable", "RandomGen"));
     tableData.add(new Parameter("values", "Collection"));
     tableData.add(new Parameter("seed", "int"));
     tableData.add(new Parameter("value", "double"));

   }
   
   /**
    * Number of columns in the table
    */
   public int getColumnCount()
   {
     return PARAMETER_COLUMNS;
   }

   /**
    * Returns a column name given a column number. This is used to
    * fill in the column headers.
    */
   public String getColumnName(int column)
   {
     switch(column)
     {
       case NAME_COLUMN: return "Name";
       case TYPE_COLUMN: return "Type";
       default: return "Unknown";
     }
   }

   /**
    * Number of rows of data
    */
   public int getRowCount()
   { return tableData.size();
   }

   /**
    * Returns false (signifying that the cell cannot be edited)
    * if the cell should not be edited
    */
   public boolean isCellEditable(int row, int col)
   {
     return false;
   }

  /**
   * Returns an object at a (row, column) position in the table.
   */
  public Object getValueAt(int row, int column)
  {
    Parameter parameter = (Parameter)tableData.elementAt(row);

    if(column == NAME_COLUMN) return parameter.getName();
    if(column == TYPE_COLUMN) return parameter.getType();

    return "Unknown";
  }

  /**
   * Sets the value at (row, column) in the table model.
   */
  public void setValueAt(Object value, int row, int column)
  {
    Parameter parameter = (Parameter)tableData.elementAt(row);

    if(column == NAME_COLUMN) parameter.setName((String)value);
    if(column == TYPE_COLUMN) parameter.setType((String)value);

    fireTableCellUpdated(row, column);
  }

} // end StateVariableTableModel


