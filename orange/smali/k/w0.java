public class k.w0 extends k.x0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final k.i0 a; //synthetic
	 public final java.io.File b; //synthetic
	 /* # direct methods */
	 public k.w0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Lk/x0;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 (( java.io.File ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/io/File;->length()J
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 public void a ( Object p0 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 try { // :try_start_0
		 v1 = this.b;
		 l.r .a ( v1 );
		 /* .line 3 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 4 */
		 k.e1.e .a ( v0 );
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 k.e1.e .a ( v0 );
		 /* throw p1 */
	 } // .end method
	 public k.i0 b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
