public class inal implements e.b.a.y.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer b;
	 public final e.b.a.y.n c;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/b/a/d0/a;->b:I */
		 /* .line 3 */
		 this.c = p2;
		 return;
	 } // .end method
	 public static e.b.a.y.n a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 e.b.a.d0.b .b ( p0 );
		 /* .line 2 */
		 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) p0 ).getConfiguration ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
		 /* iget p0, p0, Landroid/content/res/Configuration;->uiMode:I */
		 /* and-int/lit8 p0, p0, 0x30 */
		 /* .line 3 */
		 /* new-instance v1, Le/b/a/d0/a; */
		 /* invoke-direct {v1, p0, v0}, Le/b/a/d0/a;-><init>(ILe/b/a/y/n;)V */
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.security.MessageDigest p0 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 v0 = this.c;
		 int v0 = 4; // const/4 v0, 0x4
		 /* .line 5 */
		 java.nio.ByteBuffer .allocate ( v0 );
		 /* iget v1, p0, Le/b/a/d0/a;->b:I */
		 (( java.nio.ByteBuffer ) v0 ).putInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
		 (( java.nio.ByteBuffer ) v0 ).array ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B
		 /* .line 6 */
		 (( java.security.MessageDigest ) p1 ).update ( v0 ); // invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V
		 return;
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* instance-of v0, p1, Le/b/a/d0/a; */
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* check-cast p1, Le/b/a/d0/a; */
			 /* .line 3 */
			 /* iget v0, p0, Le/b/a/d0/a;->b:I */
			 /* iget v2, p1, Le/b/a/d0/a;->b:I */
			 /* if-ne v0, v2, :cond_0 */
			 v0 = this.c;
			 p1 = 			 p1 = this.c;
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 int v1 = 1; // const/4 v1, 0x1
			 } // :cond_0
		 } // .end method
		 public Integer hashCode ( ) {
			 /* .locals 2 */
			 /* .line 1 */
			 v0 = this.c;
			 /* iget v1, p0, Le/b/a/d0/a;->b:I */
			 v0 = 			 e.b.a.e0.t .a ( v0,v1 );
		 } // .end method
