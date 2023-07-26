public class e.c.a.r extends e.c.a.i1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.c.a.r c;
	 /* # instance fields */
	 public Integer b;
	 /* # direct methods */
	 public static e.c.a.r ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/c/a/r; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Le/c/a/r;-><init>(I)V */
		 return;
	 } // .end method
	 public e.c.a.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/c/a/i1;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/c/a/r;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* .line 1 */
		 /* iget v1, p0, Le/c/a/r;->b:I */
		 java.lang.Integer .valueOf ( v1 );
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, v0, v2 */
		 final String v1 = "#%06x"; // const-string v1, "#%06x"
		 java.lang.String .format ( v1,v0 );
	 } // .end method
