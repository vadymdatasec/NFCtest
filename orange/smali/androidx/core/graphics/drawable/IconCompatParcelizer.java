public class androidx.core.graphics.drawable.IconCompatParcelizer {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public androidx.core.graphics.drawable.IconCompatParcelizer ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static androidx.core.graphics.drawable.IconCompat read ( androidx.versionedparcelable.VersionedParcel p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Landroidx/core/graphics/drawable/IconCompat; */
		 /* invoke-direct {v0}, Landroidx/core/graphics/drawable/IconCompat;-><init>()V */
		 /* .line 2 */
		 /* iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
		 int v2 = 1; // const/4 v2, 0x1
		 v1 = 		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(II)I
		 /* iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
		 /* .line 3 */
		 v1 = this.c;
		 int v2 = 2; // const/4 v2, 0x2
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a([BI)[B
		 this.c = v1;
		 /* .line 4 */
		 v1 = this.d;
		 int v2 = 3; // const/4 v2, 0x3
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Landroid/os/Parcelable;I)Landroid/os/Parcelable;
		 this.d = v1;
		 /* .line 5 */
		 /* iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
		 int v2 = 4; // const/4 v2, 0x4
		 v1 = 		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(II)I
		 /* iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
		 /* .line 6 */
		 /* iget v1, v0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
		 int v2 = 5; // const/4 v2, 0x5
		 v1 = 		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(II)I
		 /* iput v1, v0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
		 /* .line 7 */
		 v1 = this.g;
		 int v2 = 6; // const/4 v2, 0x6
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Landroid/os/Parcelable;I)Landroid/os/Parcelable;
		 /* check-cast v1, Landroid/content/res/ColorStateList; */
		 this.g = v1;
		 /* .line 8 */
		 v1 = this.i;
		 int v2 = 7; // const/4 v2, 0x7
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/String;I)Ljava/lang/String;
		 this.i = v1;
		 /* .line 9 */
		 v1 = this.j;
		 /* const/16 v2, 0x8 */
		 (( androidx.versionedparcelable.VersionedParcel ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroidx/versionedparcelable/VersionedParcel;->a(Ljava/lang/String;I)Ljava/lang/String;
		 this.j = p0;
		 /* .line 10 */
		 (( androidx.core.graphics.drawable.IconCompat ) v0 ).f ( ); // invoke-virtual {v0}, Landroidx/core/graphics/drawable/IconCompat;->f()V
	 } // .end method
	 public static void write ( androidx.core.graphics.drawable.IconCompat p0, androidx.versionedparcelable.VersionedParcel p1 ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 1 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).a ( v0, v0 ); // invoke-virtual {p1, v0, v0}, Landroidx/versionedparcelable/VersionedParcel;->a(ZZ)V
		 /* .line 2 */
		 v1 = 		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).c ( ); // invoke-virtual {p1}, Landroidx/versionedparcelable/VersionedParcel;->c()Z
		 (( androidx.core.graphics.drawable.IconCompat ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Landroidx/core/graphics/drawable/IconCompat;->a(Z)V
		 /* .line 3 */
		 /* iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
		 int v2 = -1; // const/4 v2, -0x1
		 /* if-eq v2, v1, :cond_0 */
		 /* .line 4 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroidx/versionedparcelable/VersionedParcel;->b(II)V
		 /* .line 5 */
	 } // :cond_0
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 int v1 = 2; // const/4 v1, 0x2
		 /* .line 6 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b([BI)V
		 /* .line 7 */
	 } // :cond_1
	 v0 = this.d;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 int v1 = 3; // const/4 v1, 0x3
		 /* .line 8 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(Landroid/os/Parcelable;I)V
		 /* .line 9 */
	 } // :cond_2
	 /* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 int v1 = 4; // const/4 v1, 0x4
		 /* .line 10 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(II)V
		 /* .line 11 */
	 } // :cond_3
	 /* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 int v1 = 5; // const/4 v1, 0x5
		 /* .line 12 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(II)V
		 /* .line 13 */
	 } // :cond_4
	 v0 = this.g;
	 if ( v0 != null) { // if-eqz v0, :cond_5
		 int v1 = 6; // const/4 v1, 0x6
		 /* .line 14 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(Landroid/os/Parcelable;I)V
		 /* .line 15 */
	 } // :cond_5
	 v0 = this.i;
	 if ( v0 != null) { // if-eqz v0, :cond_6
		 int v1 = 7; // const/4 v1, 0x7
		 /* .line 16 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroidx/versionedparcelable/VersionedParcel;->b(Ljava/lang/String;I)V
		 /* .line 17 */
	 } // :cond_6
	 p0 = this.j;
	 if ( p0 != null) { // if-eqz p0, :cond_7
		 /* const/16 v0, 0x8 */
		 /* .line 18 */
		 (( androidx.versionedparcelable.VersionedParcel ) p1 ).b ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroidx/versionedparcelable/VersionedParcel;->b(Ljava/lang/String;I)V
	 } // :cond_7
	 return;
} // .end method
