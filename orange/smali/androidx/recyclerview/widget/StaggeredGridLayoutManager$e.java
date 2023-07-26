public class androidx.recyclerview.widget.StaggeredGridLayoutManager$e implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanParcelableUsage" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/EnclosingClass; */
/* value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "e" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer b;
public Integer c;
public Integer d;
public e;
public Integer f;
public g;
public java.util.List h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean i;
public Boolean j;
public Boolean k;
/* # direct methods */
public static androidx.recyclerview.widget.StaggeredGridLayoutManager$e ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/r/d/n0; */
/* invoke-direct {v0}, Lc/r/d/n0;-><init>()V */
return;
} // .end method
public androidx.recyclerview.widget.StaggeredGridLayoutManager$e ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public androidx.recyclerview.widget.StaggeredGridLayoutManager$e ( ) {
/* .locals 3 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
/* .line 4 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->c:I */
/* .line 5 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* if-lez v0, :cond_0 */
/* .line 6 */
/* new-array v0, v0, [I */
this.e = v0;
/* .line 7 */
(( android.os.Parcel ) p1 ).readIntArray ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V
/* .line 8 */
} // :cond_0
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
/* if-lez v0, :cond_1 */
/* .line 9 */
/* new-array v0, v0, [I */
this.g = v0;
/* .line 10 */
(( android.os.Parcel ) p1 ).readIntArray ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V
/* .line 11 */
} // :cond_1
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->i:Z */
/* .line 12 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* if-ne v0, v2, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->j:Z */
/* .line 13 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* if-ne v0, v2, :cond_4 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_4
/* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->k:Z */
/* .line 14 */
/* const-class v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* .line 15 */
(( java.lang.Class ) v0 ).getClassLoader ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( android.os.Parcel ) p1 ).readArrayList ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;
/* .line 16 */
this.h = p1;
return;
} // .end method
public androidx.recyclerview.widget.StaggeredGridLayoutManager$e ( ) {
/* .locals 1 */
/* .line 17 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 18 */
/* iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* .line 19 */
/* iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
/* .line 20 */
/* iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->c:I */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->c:I */
/* .line 21 */
v0 = this.e;
this.e = v0;
/* .line 22 */
/* iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
/* .line 23 */
v0 = this.g;
this.g = v0;
/* .line 24 */
/* iget-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->i:Z */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->i:Z */
/* .line 25 */
/* iget-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->j:Z */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->j:Z */
/* .line 26 */
/* iget-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->k:Z */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->k:Z */
/* .line 27 */
p1 = this.h;
this.h = p1;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.e = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* .line 3 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
/* .line 4 */
this.g = v0;
/* .line 5 */
this.h = v0;
return;
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 2 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->c:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 3 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 4 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* if-lez p2, :cond_0 */
/* .line 5 */
p2 = this.e;
(( android.os.Parcel ) p1 ).writeIntArray ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V
/* .line 6 */
} // :cond_0
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 7 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
/* if-lez p2, :cond_1 */
/* .line 8 */
p2 = this.g;
(( android.os.Parcel ) p1 ).writeIntArray ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V
/* .line 9 */
} // :cond_1
/* iget-boolean p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->i:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 10 */
/* iget-boolean p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->j:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 11 */
/* iget-boolean p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->k:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 12 */
p2 = this.h;
(( android.os.Parcel ) p1 ).writeList ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V
return;
} // .end method
