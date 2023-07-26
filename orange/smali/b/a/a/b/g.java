public class b.a.a.b.g implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanParcelableUsage" */
	 /* } */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Lb/a/a/b/g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.os.Handler b;
public b.a.a.b.c c;
/* # direct methods */
public static b.a.a.b.g ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lb/a/a/b/d; */
/* invoke-direct {v0}, Lb/a/a/b/d;-><init>()V */
return;
} // .end method
public b.a.a.b.g ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.b = v0;
/* .line 3 */
(( android.os.Parcel ) p1 ).readStrongBinder ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
b.a.a.b.b .a ( p1 );
this.c = p1;
return;
} // .end method
/* # virtual methods */
public void a ( Integer p0, android.os.Bundle p1 ) {
/* .locals 0 */
return;
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
p2 = this.c;
/* if-nez p2, :cond_0 */
/* .line 3 */
/* new-instance p2, Lb/a/a/b/e; */
/* invoke-direct {p2, p0}, Lb/a/a/b/e;-><init>(Lb/a/a/b/g;)V */
this.c = p2;
/* .line 4 */
} // :cond_0
p2 = this.c;
(( android.os.Parcel ) p1 ).writeStrongBinder ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
/* .line 5 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
