public class c.b.q.o0 extends android.view.View$BaseSavedState {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Lc/b/q/o0;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public Boolean b;
/* # direct methods */
public static c.b.q.o0 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/n0; */
/* invoke-direct {v0}, Lc/b/q/n0;-><init>()V */
return;
} // .end method
public c.b.q.o0 ( ) {
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V */
/* .line 3 */
p1 = (( android.os.Parcel ) p1 ).readByte ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B
if ( p1 != null) { // if-eqz p1, :cond_0
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Lc/b/q/o0;->b:Z */
return;
} // .end method
public c.b.q.o0 ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V */
return;
} // .end method
/* # virtual methods */
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
/* iget-boolean p2, p0, Lc/b/q/o0;->b:Z */
/* int-to-byte p2, p2 */
(( android.os.Parcel ) p1 ).writeByte ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V
return;
} // .end method
