public class com.google.firebase.messaging.FirebaseMessagingRegistrar implements e.f.c.k.l {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroidx/annotation/Keep; */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/google/firebase/messaging/FirebaseMessagingRegistrar$b;, */
/* Lcom/google/firebase/messaging/FirebaseMessagingRegistrar$c; */
/* } */
} // .end annotation
/* # direct methods */
public com.google.firebase.messaging.FirebaseMessagingRegistrar ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static e.f.a.a.g determineFactory ( Object p0 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_1
	 /* .line 1 */
	 v0 = e.f.a.a.i.a.g;
	 /* .line 2 */
	 (( e.f.a.a.i.a ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/a/a/i/a;->b()Ljava/util/Set;
	 final String v1 = "json"; // const-string v1, "json"
	 v0 = 	 e.f.a.a.b .a ( v1 );
	 /* if-nez v0, :cond_0 */
} // :cond_0
/* .line 3 */
} // :cond_1
} // :goto_0
/* new-instance p0, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar$c; */
/* invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar$c;-><init>()V */
} // .end method
public static final com.google.firebase.messaging.FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar ( Object p0 ) { //synthethic
/* .locals 9 */
/* .line 1 */
/* new-instance v8, Lcom/google/firebase/messaging/FirebaseMessaging; */
/* const-class v0, Le/f/c/h; */
/* .line 2 */
/* move-object v1, v0 */
/* check-cast v1, Le/f/c/h; */
/* const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId; */
/* .line 3 */
/* move-object v2, v0 */
/* check-cast v2, Lcom/google/firebase/iid/FirebaseInstanceId; */
/* const-class v0, Le/f/c/v/h; */
/* .line 4 */
/* const-class v0, Le/f/c/p/d; */
/* .line 5 */
/* const-class v0, Le/f/c/s/k; */
/* .line 6 */
/* move-object v5, v0 */
/* check-cast v5, Le/f/c/s/k; */
/* const-class v0, Le/f/a/a/g; */
/* .line 7 */
/* check-cast v0, Le/f/a/a/g; */
com.google.firebase.messaging.FirebaseMessagingRegistrar .determineFactory ( v0 );
/* const-class v0, Le/f/c/o/d; */
/* .line 8 */
/* move-object v7, p0 */
/* check-cast v7, Le/f/c/o/d; */
/* move-object v0, v8 */
/* invoke-direct/range {v0 ..v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Le/f/c/h;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;Le/f/a/a/g;Le/f/c/o/d;)V */
} // .end method
/* # virtual methods */
public java.util.List getComponents ( ) {
/* .locals 3 */
/* .annotation build Landroidx/annotation/Keep; */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/f/c/k/e<", */
/* "*>;>;" */
/* } */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Le/f/c/k/e; */
/* .line 1 */
/* const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging; */
/* .line 2 */
e.f.c.k.e .a ( v1 );
/* const-class v2, Le/f/c/h; */
/* .line 3 */
e.f.c.k.u .c ( v2 );
(( e.f.c.k.e$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
/* const-class v2, Lcom/google/firebase/iid/FirebaseInstanceId; */
/* .line 4 */
e.f.c.k.u .c ( v2 );
(( e.f.c.k.e$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
/* const-class v2, Le/f/c/v/h; */
/* .line 5 */
e.f.c.k.u .b ( v2 );
(( e.f.c.k.e$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
/* const-class v2, Le/f/c/p/d; */
/* .line 6 */
e.f.c.k.u .b ( v2 );
(( e.f.c.k.e$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
/* const-class v2, Le/f/a/a/g; */
/* .line 7 */
e.f.c.k.u .a ( v2 );
(( e.f.c.k.e$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
/* const-class v2, Le/f/c/s/k; */
/* .line 8 */
e.f.c.k.u .c ( v2 );
(( e.f.c.k.e$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
/* const-class v2, Le/f/c/o/d; */
/* .line 9 */
e.f.c.k.u .c ( v2 );
(( e.f.c.k.e$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/u;)Le/f/c/k/e$a;
v2 = e.f.c.u.r.a;
/* .line 10 */
(( e.f.c.k.e$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/k/e$a;->a(Le/f/c/k/k;)Le/f/c/k/e$a;
/* .line 11 */
(( e.f.c.k.e$a ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/k/e$a;->a()Le/f/c/k/e$a;
/* .line 12 */
(( e.f.c.k.e$a ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/k/e$a;->b()Le/f/c/k/e;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
final String v1 = "fire-fcm"; // const-string v1, "fire-fcm"
final String v2 = "20.1.7_1p"; // const-string v2, "20.1.7_1p"
/* .line 13 */
e.f.c.v.g .a ( v1,v2 );
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
/* .line 14 */
java.util.Arrays .asList ( v0 );
} // .end method
