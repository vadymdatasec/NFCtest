public class androidx.appcompat.widget.SearchView$o extends c.j.a.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/SearchView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "o" */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Landroidx/appcompat/widget/SearchView$o;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public Boolean d;
/* # direct methods */
public static androidx.appcompat.widget.SearchView$o ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/b/q/d2; */
/* invoke-direct {v0}, Lc/b/q/d2;-><init>()V */
return;
} // .end method
public androidx.appcompat.widget.SearchView$o ( ) {
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Lc/j/a/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V */
int p2 = 0; // const/4 p2, 0x0
/* .line 3 */
(( android.os.Parcel ) p1 ).readValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Boolean; */
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView$o;->d:Z */
return;
} // .end method
public androidx.appcompat.widget.SearchView$o ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Lc/j/a/c;-><init>(Landroid/os/Parcelable;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "SearchView.SavedState{"; // const-string v1, "SearchView.SavedState{"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2 */
v1 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " isIconified="; // const-string v1, " isIconified="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Landroidx/appcompat/widget/SearchView$o;->d:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/j/a/c;->writeToParcel(Landroid/os/Parcel;I)V */
/* .line 2 */
/* iget-boolean p2, p0, Landroidx/appcompat/widget/SearchView$o;->d:Z */
java.lang.Boolean .valueOf ( p2 );
(( android.os.Parcel ) p1 ).writeValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V
return;
} // .end method
