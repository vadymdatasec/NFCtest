public class androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanParcelableUsage" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/EnclosingClass; */
/* value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Integer b;
public Integer c;
public d;
public Boolean e;
/* # direct methods */
public static androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/r/d/m0; */
/* invoke-direct {v0}, Lc/r/d/m0;-><init>()V */
return;
} // .end method
public androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a ( ) {
/* .locals 0 */
/* .line 8 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* .line 3 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->c:I */
/* .line 4 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->e:Z */
/* .line 5 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* if-lez v0, :cond_1 */
/* .line 6 */
/* new-array v0, v0, [I */
this.d = v0;
/* .line 7 */
(( android.os.Parcel ) p1 ).readIntArray ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->readIntArray([I)V
} // :cond_1
return;
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* aget p1, v0, p1 */
} // :goto_0
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "FullSpanItem{mPosition="; // const-string v1, "FullSpanItem{mPosition="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mGapDir="; // const-string v1, ", mGapDir="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mHasUnwantedGapAfter="; // const-string v1, ", mHasUnwantedGapAfter="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->e:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ", mGapPerSpan="; // const-string v1, ", mGapPerSpan="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
/* .line 2 */
java.util.Arrays .toString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 2 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->c:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 3 */
/* iget-boolean p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->e:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 4 */
p2 = this.d;
if ( p2 != null) { // if-eqz p2, :cond_0
/* array-length v0, p2 */
/* if-lez v0, :cond_0 */
/* .line 5 */
/* array-length p2, p2 */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 6 */
p2 = this.d;
(( android.os.Parcel ) p1 ).writeIntArray ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 7 */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
} // :goto_0
return;
} // .end method
