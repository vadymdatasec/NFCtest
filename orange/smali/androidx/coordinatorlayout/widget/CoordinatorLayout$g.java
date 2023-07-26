public class androidx.coordinatorlayout.widget.CoordinatorLayout$g extends c.j.a.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
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
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout$g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public android.util.SparseArray d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray<", */
/* "Landroid/os/Parcelable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static androidx.coordinatorlayout.widget.CoordinatorLayout$g ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/g/d/a; */
/* invoke-direct {v0}, Lc/g/d/a;-><init>()V */
return;
} // .end method
public androidx.coordinatorlayout.widget.CoordinatorLayout$g ( ) {
/* .locals 5 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Lc/j/a/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V */
/* .line 2 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* .line 3 */
/* new-array v1, v0, [I */
/* .line 4 */
(( android.os.Parcel ) p1 ).readIntArray ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V
/* .line 5 */
(( android.os.Parcel ) p1 ).readParcelableArray ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;
/* .line 6 */
/* new-instance p2, Landroid/util/SparseArray; */
/* invoke-direct {p2, v0}, Landroid/util/SparseArray;-><init>(I)V */
this.d = p2;
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
/* if-ge p2, v0, :cond_0 */
/* .line 7 */
v2 = this.d;
/* aget v3, v1, p2 */
/* aget-object v4, p1, p2 */
(( android.util.SparseArray ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_0
return;
} // .end method
public androidx.coordinatorlayout.widget.CoordinatorLayout$g ( ) {
/* .locals 0 */
/* .line 8 */
/* invoke-direct {p0, p1}, Lc/j/a/c;-><init>(Landroid/os/Parcelable;)V */
return;
} // .end method
/* # virtual methods */
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 5 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/j/a/c;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.util.SparseArray ) v0 ).size ( ); // invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
} // :goto_0
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
/* .line 4 */
/* new-array v2, v0, [I */
/* .line 5 */
/* new-array v3, v0, [Landroid/os/Parcelable; */
} // :goto_1
/* if-ge v1, v0, :cond_1 */
/* .line 6 */
v4 = this.d;
v4 = (( android.util.SparseArray ) v4 ).keyAt ( v1 ); // invoke-virtual {v4, v1}, Landroid/util/SparseArray;->keyAt(I)I
/* aput v4, v2, v1 */
/* .line 7 */
v4 = this.d;
(( android.util.SparseArray ) v4 ).valueAt ( v1 ); // invoke-virtual {v4, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
/* check-cast v4, Landroid/os/Parcelable; */
/* aput-object v4, v3, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 8 */
} // :cond_1
(( android.os.Parcel ) p1 ).writeIntArray ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeIntArray([I)V
/* .line 9 */
(( android.os.Parcel ) p1 ).writeParcelableArray ( v3, p2 ); // invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V
return;
} // .end method
