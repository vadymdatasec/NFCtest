public class e.b.a.z.y implements e.b.a.e0.k {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/e0/k<", */
	 /* "Landroid/net/ConnectivityManager;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.content.Context a; //synthetic
/* # direct methods */
public e.b.a.z.y ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p2;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public android.net.ConnectivityManager get ( ) {
	 /* .locals 2 */
	 /* .line 2 */
	 v0 = this.a;
	 final String v1 = "connectivity"; // const-string v1, "connectivity"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/net/ConnectivityManager; */
} // .end method
public java.lang.Object get ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 (( e.b.a.z.y ) p0 ).get ( ); // invoke-virtual {p0}, Le/b/a/z/y;->get()Landroid/net/ConnectivityManager;
} // .end method
