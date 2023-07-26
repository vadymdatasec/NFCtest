public class androidx.appcompat.widget.Toolbar$g extends c.j.a.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/Toolbar; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "g" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Landroidx/appcompat/widget/Toolbar$g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer d;
public Boolean e;
/* # direct methods */
public static androidx.appcompat.widget.Toolbar$g ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/l2; */
/* invoke-direct {v0}, Lc/b/q/l2;-><init>()V */
return;
} // .end method
public androidx.appcompat.widget.Toolbar$g ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Lc/j/a/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V */
/* .line 2 */
p2 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput p2, p0, Landroidx/appcompat/widget/Toolbar$g;->d:I */
/* .line 3 */
p1 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Landroidx/appcompat/widget/Toolbar$g;->e:Z */
return;
} // .end method
public androidx.appcompat.widget.Toolbar$g ( ) {
/* .locals 0 */
/* .line 4 */
/* invoke-direct {p0, p1}, Lc/j/a/c;-><init>(Landroid/os/Parcelable;)V */
return;
} // .end method
/* # virtual methods */
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/j/a/c;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
/* iget p2, p0, Landroidx/appcompat/widget/Toolbar$g;->d:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 3 */
/* iget-boolean p2, p0, Landroidx/appcompat/widget/Toolbar$g;->e:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
