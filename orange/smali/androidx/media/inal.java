public class inal {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static androidx.media.AudioAttributesImplApi21 read ( androidx.versionedparcelable.VersionedParcel p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Landroidx/media/AudioAttributesImplApi21; */
		 /* invoke-direct {v0}, Landroidx/media/AudioAttributesImplApi21;-><init>()V */
		 /* .line 2 */
		 v1 = this.a;
		 int v2 = 1; // const/4 v2, 0x1
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Landroid/os/Parcelable;I)Landroid/os/Parcelable;
		 /* check-cast v1, Landroid/media/AudioAttributes; */
		 this.a = v1;
		 /* .line 3 */
		 /* iget v1, v0, Landroidx/media/AudioAttributesImplApi21;->b:I */
		 int v2 = 2; // const/4 v2, 0x2
		 p0 = 		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(II)I
		 /* iput p0, v0, Landroidx/media/AudioAttributesImplApi21;->b:I */
	 } // .end method
	 public static void write ( androidx.media.AudioAttributesImplApi21 p0, androidx.versionedparcelable.VersionedParcel p1 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).a ( v0, v0 ); // invoke-virtual {p1, v0, v0}, Landroidx/versionedparcelable/VersionedParcel;->a(ZZ)V
		 /* .line 2 */
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(Landroid/os/Parcelable;I)V
		 /* .line 3 */
		 /* iget p0, p0, Landroidx/media/AudioAttributesImplApi21;->b:I */
		 int v0 = 2; // const/4 v0, 0x2
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroidx/versionedparcelable/VersionedParcel;->b(II)V
		 return;
	 } // .end method
 (( androidx.versionedparcelable.VersionedParcel ) p1 ).a ( v0, v0 ); // invoke-virtual {p1, v0, v0}, Landroidx/versionedparcelable/VersionedParcel;->a(ZZ)V
		 /* .line 2 */
		 /* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->a:I */
		 int v1 = 1; // const/4 v1, 0x1
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(II)V
		 /* .line 3 */
		 /* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->b:I */
		 int v1 = 2; // const/4 v1, 0x2
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(II)V
		 /* .line 4 */
		 /* iget v0, p0, Landroidx/media/AudioAttributesImplBase;->c:I */
		 int v1 = 3; // const/4 v1, 0x3
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(II)V
		 /* .line 5 */
		 /* iget p0, p0, Landroidx/media/AudioAttributesImplBase;->d:I */
		 int v0 = 4; // const/4 v0, 0x4
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroidx/versionedparcelable/VersionedParcel;->b(II)V
		 return;
	 } // .end method
