public class e.b.a.y.z.e.v0 implements e.b.a.y.p {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/p<", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.nio.ByteBuffer a;
/* # direct methods */
public e.b.a.y.z.e.v0 ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = 4; // const/4 v0, 0x4
	 /* .line 2 */
	 java.nio.ByteBuffer .allocate ( v0 );
	 this.a = v0;
	 return;
} // .end method
/* # virtual methods */
public void a ( Object[] p0, java.lang.Integer p1, java.security.MessageDigest p2 ) {
	 /* .locals 2 */
	 /* if-nez p2, :cond_0 */
	 return;
	 /* .line 2 */
} // :cond_0
(( java.security.MessageDigest ) p3 ).update ( p1 ); // invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->update([B)V
/* .line 3 */
p1 = this.a;
/* monitor-enter p1 */
/* .line 4 */
try { // :try_start_0
	 v0 = this.a;
	 int v1 = 0; // const/4 v1, 0x0
	 (( java.nio.ByteBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
	 /* .line 5 */
	 v0 = this.a;
	 p2 = 	 (( java.lang.Integer ) p2 ).intValue ( ); // invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
	 (( java.nio.ByteBuffer ) v0 ).putInt ( p2 ); // invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;
	 (( java.nio.ByteBuffer ) p2 ).array ( ); // invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B
	 (( java.security.MessageDigest ) p3 ).update ( p2 ); // invoke-virtual {p3, p2}, Ljava/security/MessageDigest;->update([B)V
	 /* .line 6 */
	 /* monitor-exit p1 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p2 */
	 /* monitor-exit p1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw p2 */
} // .end method
public void a ( Object[] p0, java.lang.Object p1, java.security.MessageDigest p2 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p2, Ljava/lang/Integer; */
	 (( e.b.a.y.z.e.v0 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/z/e/v0;->a([BLjava/lang/Integer;Ljava/security/MessageDigest;)V
	 return;
} // .end method
