public abstract class c.a.k.f {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/a/k/f$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public java.util.Random a;
public final java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Map d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Lc/a/k/g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.ArrayList e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final transient java.util.Map f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Lc/a/k/f$a<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Map g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.os.Bundle h;
/* # direct methods */
public c.a.k.f ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/Random; */
/* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.c = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.d = v0;
/* .line 6 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.e = v0;
/* .line 7 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.f = v0;
/* .line 8 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.g = v0;
/* .line 9 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
this.h = v0;
return;
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 5 */
/* .line 39 */
v0 = this.a;
/* const/high16 v1, 0x7fff0000 */
v0 = (( java.util.Random ) v0 ).nextInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
/* const/high16 v2, 0x10000 */
} // :goto_0
/* add-int/2addr v0, v2 */
/* .line 40 */
v3 = this.b;
v3 = java.lang.Integer .valueOf ( v0 );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 41 */
v0 = this.a;
v0 = (( java.util.Random ) v0 ).nextInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
} // :cond_0
} // .end method
public final Integer a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 35 */
v0 = this.c;
/* check-cast v0, Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 36 */
p1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* .line 37 */
} // :cond_0
v0 = (( c.a.k.f ) p0 ).a ( ); // invoke-virtual {p0}, Lc/a/k/f;->a()I
/* .line 38 */
(( c.a.k.f ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/a/k/f;->a(ILjava/lang/String;)V
} // .end method
public final c.a.k.d a ( java.lang.String p0, Object p1, Object p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<I:", */
/* "Ljava/lang/Object;", */
/* "O:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/String;", */
/* "Lc/a/k/i/a<", */
/* "TI;TO;>;", */
/* "Lc/a/k/c<", */
/* "TO;>;)", */
/* "Lc/a/k/d<", */
/* "TI;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( c.a.k.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/a/k/f;->a(Ljava/lang/String;)I
/* .line 2 */
v1 = this.f;
/* new-instance v2, Lc/a/k/f$a; */
/* invoke-direct {v2, p3, p2}, Lc/a/k/f$a;-><init>(Lc/a/k/c;Lc/a/k/i/a;)V */
/* .line 3 */
v1 = v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
v1 = this.g;
/* .line 5 */
v2 = this.g;
/* .line 6 */
/* .line 7 */
} // :cond_0
v1 = this.h;
(( android.os.Bundle ) v1 ).getParcelable ( p1 ); // invoke-virtual {v1, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast v1, Lc/a/k/b; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 8 */
v2 = this.h;
(( android.os.Bundle ) v2 ).remove ( p1 ); // invoke-virtual {v2, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
/* .line 9 */
v2 = (( c.a.k.b ) v1 ).b ( ); // invoke-virtual {v1}, Lc/a/k/b;->b()I
/* .line 10 */
(( c.a.k.b ) v1 ).a ( ); // invoke-virtual {v1}, Lc/a/k/b;->a()Landroid/content/Intent;
/* .line 11 */
(( c.a.k.i.a ) p2 ).a ( v2, v1 ); // invoke-virtual {p2, v2, v1}, Lc/a/k/i/a;->a(ILandroid/content/Intent;)Ljava/lang/Object;
/* .line 12 */
} // :cond_1
/* new-instance p3, Lc/a/k/e; */
/* invoke-direct {p3, p0, p1, v0, p2}, Lc/a/k/e;-><init>(Lc/a/k/f;Ljava/lang/String;ILc/a/k/i/a;)V */
} // .end method
public final void a ( Integer p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 42 */
v0 = this.b;
java.lang.Integer .valueOf ( p1 );
/* .line 43 */
v0 = this.c;
java.lang.Integer .valueOf ( p1 );
return;
} // .end method
public final void a ( android.os.Bundle p0 ) {
/* .locals 5 */
/* if-nez p1, :cond_0 */
return;
} // :cond_0
final String v0 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"; // const-string v0, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
/* .line 13 */
(( android.os.Bundle ) p1 ).getIntegerArrayList ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
final String v1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"; // const-string v1, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
/* .line 14 */
(( android.os.Bundle ) p1 ).getStringArrayList ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
if ( v1 != null) { // if-eqz v1, :cond_3
/* if-nez v0, :cond_1 */
} // :cond_1
final String v2 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"; // const-string v2, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
/* .line 15 */
(( android.os.Bundle ) p1 ).getStringArrayList ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
this.e = v2;
final String v2 = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"; // const-string v2, "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"
/* .line 16 */
(( android.os.Bundle ) p1 ).getSerializable ( v2 ); // invoke-virtual {p1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast v2, Ljava/util/Random; */
this.a = v2;
/* .line 17 */
v2 = this.h;
final String v3 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"; // const-string v3, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
/* .line 18 */
(( android.os.Bundle ) p1 ).getBundle ( v3 ); // invoke-virtual {p1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 19 */
(( android.os.Bundle ) v2 ).putAll ( p1 ); // invoke-virtual {v2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 20 */
} // :goto_0
v2 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-ge p1, v2, :cond_3 */
/* .line 21 */
(( java.util.ArrayList ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/String; */
/* .line 22 */
v3 = v3 = this.c;
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 23 */
v3 = this.c;
/* check-cast v3, Ljava/lang/Integer; */
/* .line 24 */
v4 = this.h;
v2 = (( android.os.Bundle ) v4 ).containsKey ( v2 ); // invoke-virtual {v4, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
/* if-nez v2, :cond_2 */
/* .line 25 */
v2 = this.b;
/* .line 26 */
} // :cond_2
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
(( java.util.ArrayList ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
(( c.a.k.f ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lc/a/k/f;->a(ILjava/lang/String;)V
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_3
} // :goto_1
return;
} // .end method
public final void a ( java.lang.String p0, Integer p1, android.content.Intent p2, c.a.k.f$a p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<O:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/String;", */
/* "I", */
/* "Landroid/content/Intent;", */
/* "Lc/a/k/f$a<", */
/* "TO;>;)V" */
/* } */
} // .end annotation
if ( p4 != null) { // if-eqz p4, :cond_0
/* .line 30 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 31 */
p1 = this.b;
/* .line 32 */
(( c.a.k.i.a ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/a/k/i/a;->a(ILandroid/content/Intent;)Ljava/lang/Object;
/* .line 33 */
} // :cond_0
p4 = this.g;
/* .line 34 */
p4 = this.h;
/* new-instance v0, Lc/a/k/b; */
/* invoke-direct {v0, p2, p3}, Lc/a/k/b;-><init>(ILandroid/content/Intent;)V */
(( android.os.Bundle ) p4 ).putParcelable ( p1, v0 ); // invoke-virtual {p4, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
} // :goto_0
return;
} // .end method
public final Boolean a ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* .line 27 */
v0 = this.b;
java.lang.Integer .valueOf ( p1 );
/* check-cast p1, Ljava/lang/String; */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 28 */
} // :cond_0
v0 = this.e;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 29 */
v0 = this.f;
/* check-cast v0, Lc/a/k/f$a; */
(( c.a.k.f ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lc/a/k/f;->a(Ljava/lang/String;ILandroid/content/Intent;Lc/a/k/f$a;)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public final void b ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .line 18 */
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.c;
/* .line 19 */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
final String v1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"; // const-string v1, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
/* .line 20 */
(( android.os.Bundle ) p1 ).putIntegerArrayList ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
/* .line 21 */
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.c;
/* .line 22 */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
final String v1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"; // const-string v1, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
/* .line 23 */
(( android.os.Bundle ) p1 ).putStringArrayList ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
/* .line 24 */
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.e;
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
final String v1 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"; // const-string v1, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
(( android.os.Bundle ) p1 ).putStringArrayList ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
/* .line 25 */
v0 = this.h;
/* .line 26 */
(( android.os.Bundle ) v0 ).clone ( ); // invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;
/* check-cast v0, Landroid/os/Bundle; */
final String v1 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"; // const-string v1, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
/* .line 27 */
(( android.os.Bundle ) p1 ).putBundle ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
/* .line 28 */
v0 = this.a;
final String v1 = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"; // const-string v1, "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"
(( android.os.Bundle ) p1 ).putSerializable ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
return;
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.e;
v0 = (( java.util.ArrayList ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.c;
/* check-cast v0, Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v1 = this.b;
/* .line 4 */
} // :cond_0
v0 = this.f;
/* .line 5 */
v0 = v0 = this.g;
final String v1 = ": "; // const-string v1, ": "
final String v2 = "Dropping pending result for request "; // const-string v2, "Dropping pending result for request "
final String v3 = "ActivityResultRegistry"; // const-string v3, "ActivityResultRegistry"
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.g;
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 8 */
android.util.Log .w ( v3,v0 );
/* .line 9 */
v0 = this.g;
/* .line 10 */
} // :cond_1
v0 = this.h;
v0 = (( android.os.Bundle ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 11 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.h;
/* .line 12 */
(( android.os.Bundle ) v1 ).getParcelable ( p1 ); // invoke-virtual {v1, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 13 */
android.util.Log .w ( v3,v0 );
/* .line 14 */
v0 = this.h;
(( android.os.Bundle ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
/* .line 15 */
} // :cond_2
v0 = this.d;
/* check-cast v0, Lc/a/k/g; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 16 */
(( c.a.k.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/a/k/g;->a()V
/* .line 17 */
v0 = this.d;
} // :cond_3
return;
} // .end method
