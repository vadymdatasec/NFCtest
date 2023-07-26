public class m.a.b.j.b.c0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final org.apache.log4j.lf5.viewer.FilteredLogTableModel a; //synthetic
	 /* # direct methods */
	 public m.a.b.j.b.c0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "Maximum number of displayed LogRecords: "; // const-string v1, "Maximum number of displayed LogRecords: "
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v1 = this.a;
		 /* iget v1, v1, Lorg/apache/log4j/lf5/viewer/FilteredLogTableModel;->d:I */
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 } // .end method
