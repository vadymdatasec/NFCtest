public class androidx.recyclerview.widget.LinearLayoutManager$d implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanParcelableUsage" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/EnclosingClass; */
/* value = Landroidx/recyclerview/widget/LinearLayoutManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "d" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Landroidx/recyclerview/widget/LinearLayoutManager$d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer b;
public Integer c;
public Boolean d;
/* # direct methods */
public static androidx.recyclerview.widget.LinearLayoutManager$d ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/r/d/x; */
/* invoke-direct {v0}, Lc/r/d/x;-><init>()V */
return;
} // .end method
public androidx.recyclerview.widget.LinearLayoutManager$d ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public androidx.recyclerview.widget.LinearLayoutManager$d ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I */
/* .line 4 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->c:I */
/* .line 5 */
p1 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->d:Z */
return;
} // .end method
public androidx.recyclerview.widget.LinearLayoutManager$d ( ) {
/* .locals 1 */
/* .line 6 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 7 */
/* iget v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I */
/* .line 8 */
/* iget v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager$d;->c:I */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->c:I */
/* .line 9 */
/* iget-boolean p1, p1, Landroidx/recyclerview/widget/LinearLayoutManager$d;->d:Z */
/* iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->d:Z */
return;
} // .end method
/* # virtual methods */
public Boolean a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I */
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void b ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I */
return;
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->b:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 2 */
/* iget p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->c:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 3 */
/* iget-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager$d;->d:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
