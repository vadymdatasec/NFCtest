public class android.support.v4.media.session.ParcelableVolumeInfo implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Landroid/support/v4/media/session/ParcelableVolumeInfo;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer b;
public Integer c;
public Integer d;
public Integer e;
public Integer f;
/* # direct methods */
public static android.support.v4.media.session.ParcelableVolumeInfo ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroid/support/v4/media/session/ParcelableVolumeInfo$a; */
/* invoke-direct {v0}, Landroid/support/v4/media/session/ParcelableVolumeInfo$a;-><init>()V */
return;
} // .end method
public android.support.v4.media.session.ParcelableVolumeInfo ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->b:I */
/* .line 3 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->d:I */
/* .line 4 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->e:I */
/* .line 5 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->f:I */
/* .line 6 */
p1 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput p1, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->c:I */
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
/* iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->b:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 2 */
/* iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->d:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 3 */
/* iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->e:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 4 */
/* iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->f:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 5 */
/* iget p2, p0, Landroid/support/v4/media/session/ParcelableVolumeInfo;->c:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
