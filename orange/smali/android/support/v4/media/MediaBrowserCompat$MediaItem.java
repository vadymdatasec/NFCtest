public class android.support.v4.media.MediaBrowserCompat$MediaItem implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final Integer b;
public final android.support.v4.media.MediaDescriptionCompat c;
/* # direct methods */
public static android.support.v4.media.MediaBrowserCompat$MediaItem ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem$a; */
/* invoke-direct {v0}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem$a;-><init>()V */
return;
} // .end method
public android.support.v4.media.MediaBrowserCompat$MediaItem ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->b:I */
/* .line 3 */
v0 = android.support.v4.media.MediaDescriptionCompat.CREATOR;
/* check-cast p1, Landroid/support/v4/media/MediaDescriptionCompat; */
this.c = p1;
return;
} // .end method
/* # virtual methods */
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "MediaItem{"; // const-string v1, "MediaItem{"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "mFlags="; // const-string v1, "mFlags="
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mDescription="; // const-string v1, ", mDescription="
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;->b:I */
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
/* .line 2 */
v0 = this.c;
(( android.support.v4.media.MediaDescriptionCompat ) v0 ).writeToParcel ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/support/v4/media/MediaDescriptionCompat;->writeToParcel(Landroid/os/Parcel;I)V
return;
} // .end method
