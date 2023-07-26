public abstract class b.a.a.a.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lb/a/a/a/d$a; */
	 /* } */
} // .end annotation
/* # direct methods */
public static java.lang.CharSequence a ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p0, Landroid/media/MediaDescription; */
	 (( android.media.MediaDescription ) p0 ).getDescription ( ); // invoke-virtual {p0}, Landroid/media/MediaDescription;->getDescription()Ljava/lang/CharSequence;
} // .end method
public static java.lang.Object a ( android.os.Parcel p0 ) {
	 /* .locals 1 */
	 /* .line 3 */
	 v0 = android.media.MediaDescription.CREATOR;
} // .end method
public static void a ( java.lang.Object p0, android.os.Parcel p1, Integer p2 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 /* check-cast p0, Landroid/media/MediaDescription; */
	 (( android.media.MediaDescription ) p0 ).writeToParcel ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/media/MediaDescription;->writeToParcel(Landroid/os/Parcel;I)V
	 return;
} // .end method
public static android.os.Bundle b ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p0, Landroid/media/MediaDescription; */
	 (( android.media.MediaDescription ) p0 ).getExtras ( ); // invoke-virtual {p0}, Landroid/media/MediaDescription;->getExtras()Landroid/os/Bundle;
} // .end method
public static android.graphics.Bitmap c ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p0, Landroid/media/MediaDescription; */
	 (( android.media.MediaDescription ) p0 ).getIconBitmap ( ); // invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconBitmap()Landroid/graphics/Bitmap;
} // .end method
public static android.net.Uri d ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p0, Landroid/media/MediaDescription; */
	 (( android.media.MediaDescription ) p0 ).getIconUri ( ); // invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconUri()Landroid/net/Uri;
} // .end method
public static java.lang.String e ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p0, Landroid/media/MediaDescription; */
	 (( android.media.MediaDescription ) p0 ).getMediaId ( ); // invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaId()Ljava/lang/String;
} // .end method
public static java.lang.CharSequence f ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p0, Landroid/media/MediaDescription; */
	 (( android.media.MediaDescription ) p0 ).getSubtitle ( ); // invoke-virtual {p0}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;
} // .end method
public static java.lang.CharSequence g ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p0, Landroid/media/MediaDescription; */
	 (( android.media.MediaDescription ) p0 ).getTitle ( ); // invoke-virtual {p0}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;
} // .end method
