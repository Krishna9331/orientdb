/* Generated By:JJTree: Do not edit this line. OMatchesCondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public
class OMatchesCondition extends SimpleNode {
  public OMatchesCondition(int id) {
    super(id);
  }

  public OMatchesCondition(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=68712f476e2e633c2bbfc34cb6c39356 (do not edit this line) */