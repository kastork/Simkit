package simkit.viskit.model;

import java.util.ArrayList;

/**
 * OPNAV N81 - NPS World Class Modeling (WCM) 2004 Projects
 * MOVES Institute
 * Naval Postgraduate School, Monterey CA
 * www.nps.navy.mil
 * By:   Mike Bailey
 * Date: Mar 8, 2004
 * Time: 9:04:09 AM
 */

public class CancellingEdge extends Edge
{
  CancellingEdge()          //package-limited
  {
    parameters = new ArrayList();
  }
  
  Object copyShallow()
  {
    CancellingEdge ce = new CancellingEdge();
    ce.opaqueViewObject = opaqueViewObject;
    ce.to = to;
    ce.from = from;
    ce.parameters = parameters;
    ce.conditional = conditional;
    ce.delay = delay;
    return ce;
  }
}
