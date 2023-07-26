public class androidx.versionedparcelable.ParcelImpl implements android.os.Parcelable {
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
/* "Landroidx/versionedparcelable/ParcelImpl;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final c.x.b b;
/* # direct methods */
public static androidx.versionedparcelable.ParcelImpl ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroidx/versionedparcelable/ParcelImpl$a; */
/* invoke-direct {v0}, Landroidx/versionedparcelable/ParcelImpl$a;-><init>()V */
return;
} // .end method
public androidx.versionedparcelable.ParcelImpl ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/x/a; */
/* invoke-direct {v0, p1}, Lc/x/a;-><init>(Landroid/os/Parcel;)V */
(( androidx.versionedparcelable.VersionedParcel ) v0 ).j ( ); // invoke-virtual {v0}, Landroidx/versionedparcelable/VersionedParcel;->j()Lc/x/b;
this.b = p1;
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
/* new-instance p2, Lc/x/a; */
/* invoke-direct {p2, p1}, Lc/x/a;-><init>(Landroid/os/Parcel;)V */
/* .line 2 */
p1 = this.b;
(( androidx.versionedparcelable.VersionedParcel ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/versionedparcelable/VersionedParcel;->a(Lc/x/b;)V
return;
} // .end method
