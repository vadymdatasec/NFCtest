public class androidx.core.app.RemoteActionCompatParcelizer {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public androidx.core.app.RemoteActionCompatParcelizer ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static androidx.core.app.RemoteActionCompat read ( androidx.versionedparcelable.VersionedParcel p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Landroidx/core/app/RemoteActionCompat; */
		 /* invoke-direct {v0}, Landroidx/core/app/RemoteActionCompat;-><init>()V */
		 /* .line 2 */
		 v1 = this.a;
		 int v2 = 1; // const/4 v2, 0x1
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Lc/x/b;I)Lc/x/b;
		 /* check-cast v1, Landroidx/core/graphics/drawable/IconCompat; */
		 this.a = v1;
		 /* .line 3 */
		 v1 = this.b;
		 int v2 = 2; // const/4 v2, 0x2
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;
		 this.b = v1;
		 /* .line 4 */
		 v1 = this.c;
		 int v2 = 3; // const/4 v2, 0x3
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;
		 this.c = v1;
		 /* .line 5 */
		 v1 = this.d;
		 int v2 = 4; // const/4 v2, 0x4
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Landroid/os/Parcelable;I)Landroid/os/Parcelable;
		 /* check-cast v1, Landroid/app/PendingIntent; */
		 this.d = v1;
		 /* .line 6 */
		 /* iget-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->e:Z */
		 int v2 = 5; // const/4 v2, 0x5
		 v1 = 		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(ZI)Z
		 /* iput-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->e:Z */
		 /* .line 7 */
		 /* iget-boolean v1, v0, Landroidx/core/app/RemoteActionCompat;->f:Z */
		 int v2 = 6; // const/4 v2, 0x6
		 p0 = 		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(ZI)Z
		 /* iput-boolean p0, v0, Landroidx/core/app/RemoteActionCompat;->f:Z */
	 } // .end method
	 public static void write ( androidx.core.app.RemoteActionCompat p0, androidx.versionedparcelable.VersionedParcel p1 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).a ( v0, v0 ); // invoke-virtual {p1, v0, v0}, Landroidx/versionedparcelable/VersionedParcel;->a(ZZ)V
		 /* .line 2 */
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(Lc/x/b;I)V
		 /* .line 3 */
		 v0 = this.b;
		 int v1 = 2; // const/4 v1, 0x2
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(Ljava/lang/CharSequence;I)V
		 /* .line 4 */
		 v0 = this.c;
		 int v1 = 3; // const/4 v1, 0x3
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(Ljava/lang/CharSequence;I)V
		 /* .line 5 */
		 v0 = this.d;
		 int v1 = 4; // const/4 v1, 0x4
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(Landroid/os/Parcelable;I)V
		 /* .line 6 */
		 /* iget-boolean v0, p0, Landroidx/core/app/RemoteActionCompat;->e:Z */
		 int v1 = 5; // const/4 v1, 0x5
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(ZI)V
		 /* .line 7 */
		 /* iget-boolean p0, p0, Landroidx/core/app/RemoteActionCompat;->f:Z */
		 int v0 = 6; // const/4 v0, 0x6
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroidx/versionedparcelable/VersionedParcel;->b(ZI)V
		 return;
	 } // .end method
