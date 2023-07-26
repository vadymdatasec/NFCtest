public class e.f.a.b.b.g implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Le/f/a/b/b/g;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public android.os.Messenger b;
public e.f.a.b.b.d c;
/* # direct methods */
public static e.f.a.b.b.g ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/a/b/b/i; */
/* invoke-direct {v0}, Le/f/a/b/b/i;-><init>()V */
return;
} // .end method
public e.f.a.b.b.g ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 3 */
/* new-instance v0, Landroid/os/Messenger; */
/* invoke-direct {v0, p1}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V */
this.b = v0;
return;
/* .line 4 */
} // :cond_0
/* new-instance v0, Le/f/a/b/b/c; */
/* invoke-direct {v0, p1}, Le/f/a/b/b/c;-><init>(Landroid/os/IBinder;)V */
this.c = v0;
return;
} // .end method
/* # virtual methods */
public final android.os.IBinder a ( ) {
/* .locals 1 */
/* .line 4 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.os.Messenger ) v0 ).getBinder ( ); // invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;
} // :cond_0
v0 = this.c;
} // .end method
public final void a ( android.os.Message p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.os.Messenger ) v0 ).send ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
return;
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 1 */
} // :cond_0
try { // :try_start_0
(( e.f.a.b.b.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/b/g;->a()Landroid/os/IBinder;
/* check-cast p1, Le/f/a/b/b/g; */
(( e.f.a.b.b.g ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/b/g;->a()Landroid/os/IBinder;
p1 = (( java.lang.Object ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
(( e.f.a.b.b.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/b/g;->a()Landroid/os/IBinder;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.b;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 2 */
(( android.os.Messenger ) p2 ).getBinder ( ); // invoke-virtual {p2}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;
(( android.os.Parcel ) p1 ).writeStrongBinder ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
return;
/* .line 3 */
} // :cond_0
p2 = this.c;
(( android.os.Parcel ) p1 ).writeStrongBinder ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
return;
} // .end method
