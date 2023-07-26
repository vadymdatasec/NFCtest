public class inal implements android.os.Parcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanParcelableUsage" */
	 /* } */
} // .end annotation
/* # static fields */
public static final android.os.Parcelable$Creator CREATOR;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/Parcelable$Creator<", */
/* "Lc/l/d/x1;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final java.lang.String b;
public final java.lang.String c;
public final Boolean d;
public final Integer e;
public final Integer f;
public final java.lang.String g;
public final Boolean h;
public final Boolean i;
public final Boolean j;
public final android.os.Bundle k;
public final Boolean l;
public final Integer m;
public android.os.Bundle n;
/* # direct methods */
public static inal ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lc/l/d/w1; */
/* invoke-direct {v0}, Lc/l/d/w1;-><init>()V */
return;
} // .end method
public inal ( ) {
/* .locals 3 */
/* .line 14 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 15 */
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.b = v0;
/* .line 16 */
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.c = v0;
/* .line 17 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iput-boolean v0, p0, Lc/l/d/x1;->d:Z */
/* .line 18 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Lc/l/d/x1;->e:I */
/* .line 19 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput v0, p0, Lc/l/d/x1;->f:I */
/* .line 20 */
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.g = v0;
/* .line 21 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* iput-boolean v0, p0, Lc/l/d/x1;->h:Z */
/* .line 22 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_2
/* iput-boolean v0, p0, Lc/l/d/x1;->i:Z */
/* .line 23 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
if ( v0 != null) { // if-eqz v0, :cond_3
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_3
/* iput-boolean v0, p0, Lc/l/d/x1;->j:Z */
/* .line 24 */
(( android.os.Parcel ) p1 ).readBundle ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
this.k = v0;
/* .line 25 */
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
if ( v0 != null) { // if-eqz v0, :cond_4
} // :cond_4
int v1 = 0; // const/4 v1, 0x0
} // :goto_4
/* iput-boolean v1, p0, Lc/l/d/x1;->l:Z */
/* .line 26 */
(( android.os.Parcel ) p1 ).readBundle ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;
this.n = v0;
/* .line 27 */
p1 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
/* iput p1, p0, Lc/l/d/x1;->m:I */
return;
} // .end method
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
this.b = v0;
/* .line 3 */
v0 = this.g;
this.c = v0;
/* .line 4 */
/* iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->o:Z */
/* iput-boolean v0, p0, Lc/l/d/x1;->d:Z */
/* .line 5 */
/* iget v0, p1, Landroidx/fragment/app/Fragment;->x:I */
/* iput v0, p0, Lc/l/d/x1;->e:I */
/* .line 6 */
/* iget v0, p1, Landroidx/fragment/app/Fragment;->y:I */
/* iput v0, p0, Lc/l/d/x1;->f:I */
/* .line 7 */
v0 = this.z;
this.g = v0;
/* .line 8 */
/* iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->C:Z */
/* iput-boolean v0, p0, Lc/l/d/x1;->h:Z */
/* .line 9 */
/* iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->n:Z */
/* iput-boolean v0, p0, Lc/l/d/x1;->i:Z */
/* .line 10 */
/* iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->B:Z */
/* iput-boolean v0, p0, Lc/l/d/x1;->j:Z */
/* .line 11 */
v0 = this.h;
this.k = v0;
/* .line 12 */
/* iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->A:Z */
/* iput-boolean v0, p0, Lc/l/d/x1;->l:Z */
/* .line 13 */
p1 = this.R;
p1 = (( java.lang.Enum ) p1 ).ordinal ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I
/* iput p1, p0, Lc/l/d/x1;->m:I */
return;
} // .end method
/* # virtual methods */
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x80 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "FragmentState{"; // const-string v1, "FragmentState{"
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " ("; // const-string v1, " ("
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")}:"; // const-string v1, ")}:"
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
/* iget-boolean v1, p0, Lc/l/d/x1;->d:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = " fromLayout"; // const-string v1, " fromLayout"
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
} // :cond_0
/* iget v1, p0, Lc/l/d/x1;->f:I */
if ( v1 != null) { // if-eqz v1, :cond_1
final String v1 = " id=0x"; // const-string v1, " id=0x"
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 11 */
/* iget v1, p0, Lc/l/d/x1;->f:I */
java.lang.Integer .toHexString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 12 */
} // :cond_1
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = (( java.lang.String ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z
/* if-nez v1, :cond_2 */
final String v1 = " tag="; // const-string v1, " tag="
/* .line 13 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 14 */
v1 = this.g;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 15 */
} // :cond_2
/* iget-boolean v1, p0, Lc/l/d/x1;->h:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
final String v1 = " retainInstance"; // const-string v1, " retainInstance"
/* .line 16 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 17 */
} // :cond_3
/* iget-boolean v1, p0, Lc/l/d/x1;->i:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
final String v1 = " removing"; // const-string v1, " removing"
/* .line 18 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 19 */
} // :cond_4
/* iget-boolean v1, p0, Lc/l/d/x1;->j:Z */
if ( v1 != null) { // if-eqz v1, :cond_5
final String v1 = " detached"; // const-string v1, " detached"
/* .line 20 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 21 */
} // :cond_5
/* iget-boolean v1, p0, Lc/l/d/x1;->l:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
final String v1 = " hidden"; // const-string v1, " hidden"
/* .line 22 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 23 */
} // :cond_6
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.b;
(( android.os.Parcel ) p1 ).writeString ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* .line 2 */
p2 = this.c;
(( android.os.Parcel ) p1 ).writeString ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* .line 3 */
/* iget-boolean p2, p0, Lc/l/d/x1;->d:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 4 */
/* iget p2, p0, Lc/l/d/x1;->e:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 5 */
/* iget p2, p0, Lc/l/d/x1;->f:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 6 */
p2 = this.g;
(( android.os.Parcel ) p1 ).writeString ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* .line 7 */
/* iget-boolean p2, p0, Lc/l/d/x1;->h:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 8 */
/* iget-boolean p2, p0, Lc/l/d/x1;->i:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 9 */
/* iget-boolean p2, p0, Lc/l/d/x1;->j:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 10 */
p2 = this.k;
(( android.os.Parcel ) p1 ).writeBundle ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
/* .line 11 */
/* iget-boolean p2, p0, Lc/l/d/x1;->l:Z */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
/* .line 12 */
p2 = this.n;
(( android.os.Parcel ) p1 ).writeBundle ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
/* .line 13 */
/* iget p2, p0, Lc/l/d/x1;->m:I */
(( android.os.Parcel ) p1 ).writeInt ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
