public class c.l.d.b0 implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanParcelableUsage, ParcelClassLoader" */
	 /* } */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Lc/l/d/b0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.os.Bundle b;
/* # direct methods */
public static c.l.d.b0 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/l/d/a0; */
/* invoke-direct {v0}, Lc/l/d/a0;-><init>()V */
return;
} // .end method
public c.l.d.b0 ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
return;
} // .end method
public c.l.d.b0 ( ) {
/* .locals 0 */
/* .line 3 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 4 */
(( android.os.Parcel ) p1 ).readBundle ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
this.b = p1;
if ( p2 != null) { // if-eqz p2, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 5 */
	 (( android.os.Bundle ) p1 ).setClassLoader ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.b;
(( android.os.Parcel ) p1 ).writeBundle ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
return;
} // .end method
