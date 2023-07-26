public class androidx.core.widget.NestedScrollView$c extends android.view.View$BaseSavedState {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/core/widget/NestedScrollView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "c" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Landroidx/core/widget/NestedScrollView$c;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer b;
/* # direct methods */
public static androidx.core.widget.NestedScrollView$c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/h/o/k; */
/* invoke-direct {v0}, Lc/h/o/k;-><init>()V */
return;
} // .end method
public androidx.core.widget.NestedScrollView$c ( ) {
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V */
/* .line 3 */
p1 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput p1, p0, Landroidx/core/widget/NestedScrollView$c;->b:I */
return;
} // .end method
public androidx.core.widget.NestedScrollView$c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "HorizontalScrollView.SavedState{"; // const-string v1, "HorizontalScrollView.SavedState{"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2 */
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " scrollPosition="; // const-string v1, " scrollPosition="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/core/widget/NestedScrollView$c;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
/* iget p2, p0, Landroidx/core/widget/NestedScrollView$c;->b:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
