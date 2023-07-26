public class e.b.a.y.z.e.x0 extends android.media.MediaDataSource {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.nio.ByteBuffer b; //synthetic
	 /* # direct methods */
	 public e.b.a.y.z.e.x0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p2;
		 /* invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void close ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public Long getSize ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( java.nio.ByteBuffer ) v0 ).limit ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I
		 /* int-to-long v0, v0 */
		 /* return-wide v0 */
	 } // .end method
	 public Integer readAt ( Long p0, Object[] p1, Integer p2, Integer p3 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( java.nio.ByteBuffer ) v0 ).limit ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I
		 /* int-to-long v0, v0 */
		 /* cmp-long v2, p1, v0 */
		 /* if-ltz v2, :cond_0 */
		 int p1 = -1; // const/4 p1, -0x1
		 /* .line 2 */
	 } // :cond_0
	 v0 = this.b;
	 /* long-to-int p2, p1 */
	 (( java.nio.ByteBuffer ) v0 ).position ( p2 ); // invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
	 /* .line 3 */
	 p1 = this.b;
	 p1 = 	 (( java.nio.ByteBuffer ) p1 ).remaining ( ); // invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I
	 p1 = 	 java.lang.Math .min ( p5,p1 );
	 /* .line 4 */
	 p2 = this.b;
	 (( java.nio.ByteBuffer ) p2 ).get ( p3, p4, p1 ); // invoke-virtual {p2, p3, p4, p1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
} // .end method
