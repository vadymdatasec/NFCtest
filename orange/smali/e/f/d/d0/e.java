public abstract class e.f.d.d0.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.reflect.Type a;
	 /* # direct methods */
	 public static e.f.d.d0.e ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [Ljava/lang/reflect/Type; */
		 /* .line 1 */
		 return;
	 } // .end method
	 public static Integer a ( java.lang.Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 p0 = 		 e.f.d.d0.e .b ( p0 );
	 } // .end method
	 public static Integer a ( java.lang.Object[] p0, java.lang.Object p1 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 87 */
	 } // :goto_0
	 /* array-length v1, p0 */
	 /* if-ge v0, v1, :cond_1 */
	 /* .line 88 */
	 /* aget-object v1, p0, v0 */
	 v1 = 	 (( java.lang.Object ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
	 } // :cond_0
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* .line 89 */
} // :cond_1
/* new-instance p0, Ljava/util/NoSuchElementException; */
/* invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw p0 */
} // .end method
public static java.lang.Class a ( java.lang.reflect.TypeVariable p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/TypeVariable<", */
/* "*>;)", */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
/* .line 90 */
/* .line 91 */
/* instance-of v0, p0, Ljava/lang/Class; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p0, Ljava/lang/Class; */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static java.lang.reflect.ParameterizedType a ( java.lang.reflect.Type p0, java.lang.reflect.Type p1, java.lang.reflect.Type...p2 ) {
/* .locals 1 */
/* .line 3 */
/* new-instance v0, Le/f/d/d0/c; */
/* invoke-direct {v0, p0, p1, p2}, Le/f/d/d0/c;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V */
} // .end method
public static java.lang.reflect.Type a ( java.lang.reflect.Type p0, java.lang.Class p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Type;", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Type;" */
/* } */
} // .end annotation
/* .line 40 */
/* const-class v0, Ljava/util/Collection; */
e.f.d.d0.e .b ( p0,p1,v0 );
/* .line 41 */
/* instance-of p1, p0, Ljava/lang/reflect/WildcardType; */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 42 */
/* check-cast p0, Ljava/lang/reflect/WildcardType; */
/* aget-object p0, p0, v0 */
/* .line 43 */
} // :cond_0
/* instance-of p1, p0, Ljava/lang/reflect/ParameterizedType; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 44 */
/* check-cast p0, Ljava/lang/reflect/ParameterizedType; */
/* aget-object p0, p0, v0 */
/* .line 45 */
} // :cond_1
/* const-class p0, Ljava/lang/Object; */
} // .end method
public static java.lang.reflect.Type a ( java.lang.reflect.Type p0, java.lang.Class p1, java.lang.Class p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Type;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Type;" */
/* } */
} // .end annotation
/* if-ne p2, p1, :cond_0 */
/* .line 27 */
} // :cond_0
p0 = (( java.lang.Class ) p2 ).isInterface ( ); // invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z
if ( p0 != null) { // if-eqz p0, :cond_3
/* .line 28 */
(( java.lang.Class ) p1 ).getInterfaces ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;
int v0 = 0; // const/4 v0, 0x0
/* .line 29 */
/* array-length v1, p0 */
} // :goto_0
/* if-ge v0, v1, :cond_3 */
/* .line 30 */
/* aget-object v2, p0, v0 */
/* if-ne v2, p2, :cond_1 */
/* .line 31 */
(( java.lang.Class ) p1 ).getGenericInterfaces ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;
/* aget-object p0, p0, v0 */
/* .line 32 */
} // :cond_1
/* aget-object v2, p0, v0 */
v2 = (( java.lang.Class ) p2 ).isAssignableFrom ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 33 */
(( java.lang.Class ) p1 ).getGenericInterfaces ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;
/* aget-object p1, p1, v0 */
/* aget-object p0, p0, v0 */
e.f.d.d0.e .a ( p1,p0,p2 );
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
/* .line 34 */
} // :cond_3
p0 = (( java.lang.Class ) p1 ).isInterface ( ); // invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z
/* if-nez p0, :cond_6 */
/* .line 35 */
} // :goto_1
/* const-class p0, Ljava/lang/Object; */
/* if-eq p1, p0, :cond_6 */
/* .line 36 */
(( java.lang.Class ) p1 ).getSuperclass ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
/* if-ne p0, p2, :cond_4 */
/* .line 37 */
(( java.lang.Class ) p1 ).getGenericSuperclass ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
/* .line 38 */
} // :cond_4
v0 = (( java.lang.Class ) p2 ).isAssignableFrom ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 39 */
(( java.lang.Class ) p1 ).getGenericSuperclass ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;
e.f.d.d0.e .a ( p1,p0,p2 );
} // :cond_5
/* move-object p1, p0 */
} // :cond_6
} // .end method
public static java.lang.reflect.Type a ( java.lang.reflect.Type p0, java.lang.Class p1, java.lang.reflect.Type p2 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Type;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/reflect/Type;", */
/* ")", */
/* "Ljava/lang/reflect/Type;" */
/* } */
} // .end annotation
/* .line 46 */
} // :goto_0
/* instance-of v0, p2, Ljava/lang/reflect/TypeVariable; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 47 */
/* check-cast p2, Ljava/lang/reflect/TypeVariable; */
/* .line 48 */
e.f.d.d0.e .a ( p0,p1,p2 );
/* if-ne v0, p2, :cond_0 */
} // :cond_0
/* move-object p2, v0 */
/* .line 49 */
} // :cond_1
/* instance-of v0, p2, Ljava/lang/Class; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* move-object v0, p2 */
/* check-cast v0, Ljava/lang/Class; */
v1 = (( java.lang.Class ) v0 ).isArray ( ); // invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 50 */
(( java.lang.Class ) v0 ).getComponentType ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
/* .line 51 */
e.f.d.d0.e .a ( p0,p1,p2 );
/* if-ne p2, p0, :cond_2 */
/* .line 52 */
} // :cond_2
e.f.d.d0.e .b ( p0 );
} // :goto_1
/* .line 53 */
} // :cond_3
/* instance-of v0, p2, Ljava/lang/reflect/GenericArrayType; */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 54 */
/* check-cast p2, Ljava/lang/reflect/GenericArrayType; */
/* .line 55 */
/* .line 56 */
e.f.d.d0.e .a ( p0,p1,v0 );
/* if-ne v0, p0, :cond_4 */
/* .line 57 */
} // :cond_4
e.f.d.d0.e .b ( p0 );
} // :goto_2
/* .line 58 */
} // :cond_5
/* instance-of v0, p2, Ljava/lang/reflect/ParameterizedType; */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 59 */
/* check-cast p2, Ljava/lang/reflect/ParameterizedType; */
/* .line 60 */
/* .line 61 */
e.f.d.d0.e .a ( p0,p1,v0 );
/* if-eq v3, v0, :cond_6 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_6
int v0 = 0; // const/4 v0, 0x0
/* .line 62 */
} // :goto_3
/* .line 63 */
/* array-length v5, v4 */
} // :goto_4
/* if-ge v2, v5, :cond_9 */
/* .line 64 */
/* aget-object v6, v4, v2 */
e.f.d.d0.e .a ( p0,p1,v6 );
/* .line 65 */
/* aget-object v7, v4, v2 */
/* if-eq v6, v7, :cond_8 */
/* if-nez v0, :cond_7 */
/* .line 66 */
(( java.lang.reflect.Type ) v4 ).clone ( ); // invoke-virtual {v4}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;
/* move-object v4, v0 */
/* check-cast v4, [Ljava/lang/reflect/Type; */
int v0 = 1; // const/4 v0, 0x1
/* .line 67 */
} // :cond_7
/* aput-object v6, v4, v2 */
} // :cond_8
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_9
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 68 */
e.f.d.d0.e .a ( v3,p0,v4 );
} // :cond_a
/* .line 69 */
} // :cond_b
/* instance-of v0, p2, Ljava/lang/reflect/WildcardType; */
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 70 */
/* check-cast p2, Ljava/lang/reflect/WildcardType; */
/* .line 71 */
/* .line 72 */
/* .line 73 */
/* array-length v4, v0 */
/* if-ne v4, v1, :cond_c */
/* .line 74 */
/* aget-object v1, v0, v2 */
e.f.d.d0.e .a ( p0,p1,v1 );
/* .line 75 */
/* aget-object p1, v0, v2 */
/* if-eq p0, p1, :cond_d */
/* .line 76 */
e.f.d.d0.e .h ( p0 );
/* .line 77 */
} // :cond_c
/* array-length v0, v3 */
/* if-ne v0, v1, :cond_d */
/* .line 78 */
/* aget-object v0, v3, v2 */
try { // :try_start_0
e.f.d.d0.e .a ( p0,p1,v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 79 */
/* aget-object p1, v3, v2 */
/* if-eq p0, p1, :cond_d */
/* .line 80 */
e.f.d.d0.e .g ( p0 );
} // :cond_d
/* :catchall_0 */
/* move-exception p0 */
/* .line 81 */
/* throw p0 */
} // .end method
public static java.lang.reflect.Type a ( java.lang.reflect.Type p0, java.lang.Class p1, java.lang.reflect.TypeVariable p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Type;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/reflect/TypeVariable<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Type;" */
/* } */
} // .end annotation
/* .line 82 */
e.f.d.d0.e .a ( p2 );
/* if-nez v0, :cond_0 */
/* .line 83 */
} // :cond_0
e.f.d.d0.e .a ( p0,p1,v0 );
/* .line 84 */
/* instance-of p1, p0, Ljava/lang/reflect/ParameterizedType; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 85 */
(( java.lang.Class ) v0 ).getTypeParameters ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;
p1 = e.f.d.d0.e .a ( p1,p2 );
/* .line 86 */
/* check-cast p0, Ljava/lang/reflect/ParameterizedType; */
/* aget-object p0, p0, p1 */
} // :cond_1
} // .end method
public static void a ( java.lang.reflect.Type p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
e.f.d.d0.e .d ( p0 );
return;
} // .end method
public static Boolean a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* if-eq p0, p1, :cond_1 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 4 */
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
public static Boolean a ( java.lang.reflect.Type p0, java.lang.reflect.Type p1 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
/* .line 5 */
} // :cond_0
/* instance-of v1, p0, Ljava/lang/Class; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 6 */
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* .line 7 */
} // :cond_1
/* instance-of v1, p0, Ljava/lang/reflect/ParameterizedType; */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 8 */
/* instance-of v1, p1, Ljava/lang/reflect/ParameterizedType; */
/* if-nez v1, :cond_2 */
/* .line 9 */
} // :cond_2
/* check-cast p0, Ljava/lang/reflect/ParameterizedType; */
/* .line 10 */
/* check-cast p1, Ljava/lang/reflect/ParameterizedType; */
/* .line 11 */
v1 = e.f.d.d0.e .a ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = (( java.lang.Object ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
p0 = java.util.Arrays .equals ( p0,p1 );
if ( p0 != null) { // if-eqz p0, :cond_3
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 12 */
} // :cond_4
/* instance-of v1, p0, Ljava/lang/reflect/GenericArrayType; */
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 13 */
/* instance-of v0, p1, Ljava/lang/reflect/GenericArrayType; */
/* if-nez v0, :cond_5 */
/* .line 14 */
} // :cond_5
/* check-cast p0, Ljava/lang/reflect/GenericArrayType; */
/* .line 15 */
/* check-cast p1, Ljava/lang/reflect/GenericArrayType; */
/* .line 16 */
p0 = e.f.d.d0.e .a ( p0,p1 );
/* .line 17 */
} // :cond_6
/* instance-of v1, p0, Ljava/lang/reflect/WildcardType; */
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 18 */
/* instance-of v1, p1, Ljava/lang/reflect/WildcardType; */
/* if-nez v1, :cond_7 */
/* .line 19 */
} // :cond_7
/* check-cast p0, Ljava/lang/reflect/WildcardType; */
/* .line 20 */
/* check-cast p1, Ljava/lang/reflect/WildcardType; */
/* .line 21 */
v1 = java.util.Arrays .equals ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_8
p0 = java.util.Arrays .equals ( p0,p1 );
if ( p0 != null) { // if-eqz p0, :cond_8
} // :cond_8
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* .line 22 */
} // :cond_9
/* instance-of v1, p0, Ljava/lang/reflect/TypeVariable; */
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 23 */
/* instance-of v1, p1, Ljava/lang/reflect/TypeVariable; */
/* if-nez v1, :cond_a */
/* .line 24 */
} // :cond_a
/* check-cast p0, Ljava/lang/reflect/TypeVariable; */
/* .line 25 */
/* check-cast p1, Ljava/lang/reflect/TypeVariable; */
/* .line 26 */
/* if-ne v1, v3, :cond_b */
p0 = (( java.lang.String ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_b
} // :cond_b
int v0 = 0; // const/4 v0, 0x0
} // :goto_2
} // :cond_c
} // .end method
public static Integer b ( java.lang.Object p0 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 2 */
p0 = (( java.lang.Object ) p0 ).hashCode ( ); // invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static java.lang.reflect.GenericArrayType b ( java.lang.reflect.Type p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/d/d0/b; */
/* invoke-direct {v0, p0}, Le/f/d/d0/b;-><init>(Ljava/lang/reflect/Type;)V */
} // .end method
public static java.lang.reflect.Type b ( java.lang.reflect.Type p0, java.lang.Class p1, java.lang.Class p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Type;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Type;" */
/* } */
} // .end annotation
/* .line 3 */
v0 = (( java.lang.Class ) p2 ).isAssignableFrom ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
e.f.d.d0.a .a ( v0 );
/* .line 4 */
e.f.d.d0.e .a ( p0,p1,p2 );
e.f.d.d0.e .a ( p0,p1,p2 );
} // .end method
public static java.lang.reflect.Type b ( java.lang.reflect.Type p0, java.lang.Class p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Type;", */
/* "Ljava/lang/Class<", */
/* "*>;)[", */
/* "Ljava/lang/reflect/Type;" */
/* } */
} // .end annotation
/* .line 5 */
/* const-class v0, Ljava/lang/Object; */
/* const-class v1, Ljava/lang/String; */
/* const-class v2, Ljava/util/Properties; */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
int v5 = 2; // const/4 v5, 0x2
/* if-ne p0, v2, :cond_0 */
/* new-array p0, v5, [Ljava/lang/reflect/Type; */
/* aput-object v1, p0, v4 */
/* aput-object v1, p0, v3 */
/* .line 6 */
} // :cond_0
/* const-class v1, Ljava/util/Map; */
e.f.d.d0.e .b ( p0,p1,v1 );
/* .line 7 */
/* instance-of p1, p0, Ljava/lang/reflect/ParameterizedType; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 8 */
/* check-cast p0, Ljava/lang/reflect/ParameterizedType; */
/* .line 9 */
} // :cond_1
/* new-array p0, v5, [Ljava/lang/reflect/Type; */
/* aput-object v0, p0, v4 */
/* aput-object v0, p0, v3 */
} // .end method
public static java.lang.reflect.Type c ( java.lang.reflect.Type p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p0, Ljava/lang/Class; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* check-cast p0, Ljava/lang/Class; */
/* .line 3 */
v0 = (( java.lang.Class ) p0 ).isArray ( ); // invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Le/f/d/d0/b; */
(( java.lang.Class ) p0 ).getComponentType ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
e.f.d.d0.e .c ( p0 );
/* invoke-direct {v0, p0}, Le/f/d/d0/b;-><init>(Ljava/lang/reflect/Type;)V */
/* move-object p0, v0 */
} // :cond_0
/* .line 4 */
} // :cond_1
/* instance-of v0, p0, Ljava/lang/reflect/ParameterizedType; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
/* check-cast p0, Ljava/lang/reflect/ParameterizedType; */
/* .line 6 */
/* new-instance v0, Le/f/d/d0/c; */
/* invoke-direct {v0, v1, v2, p0}, Le/f/d/d0/c;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V */
/* .line 7 */
} // :cond_2
/* instance-of v0, p0, Ljava/lang/reflect/GenericArrayType; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 8 */
/* check-cast p0, Ljava/lang/reflect/GenericArrayType; */
/* .line 9 */
/* new-instance v0, Le/f/d/d0/b; */
/* invoke-direct {v0, p0}, Le/f/d/d0/b;-><init>(Ljava/lang/reflect/Type;)V */
/* .line 10 */
} // :cond_3
/* instance-of v0, p0, Ljava/lang/reflect/WildcardType; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 11 */
/* check-cast p0, Ljava/lang/reflect/WildcardType; */
/* .line 12 */
/* new-instance v0, Le/f/d/d0/d; */
/* invoke-direct {v0, v1, p0}, Le/f/d/d0/d;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V */
} // :cond_4
} // .end method
public static void d ( java.lang.reflect.Type p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p0, Ljava/lang/Class; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast p0, Ljava/lang/Class; */
p0 = (( java.lang.Class ) p0 ).isPrimitive ( ); // invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z
/* if-nez p0, :cond_0 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
e.f.d.d0.a .a ( p0 );
return;
} // .end method
public static java.lang.reflect.Type e ( java.lang.reflect.Type p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p0, Ljava/lang/reflect/GenericArrayType; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p0, Ljava/lang/reflect/GenericArrayType; */
} // :cond_0
/* check-cast p0, Ljava/lang/Class; */
(( java.lang.Class ) p0 ).getComponentType ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
} // :goto_0
} // .end method
public static java.lang.Class f ( java.lang.reflect.Type p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/reflect/Type;", */
/* ")", */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
/* .line 1 */
/* instance-of v0, p0, Ljava/lang/Class; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p0, Ljava/lang/Class; */
/* .line 3 */
} // :cond_0
/* instance-of v0, p0, Ljava/lang/reflect/ParameterizedType; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* check-cast p0, Ljava/lang/reflect/ParameterizedType; */
/* .line 5 */
/* .line 6 */
/* instance-of v0, p0, Ljava/lang/Class; */
e.f.d.d0.a .a ( v0 );
/* .line 7 */
/* check-cast p0, Ljava/lang/Class; */
/* .line 8 */
} // :cond_1
/* instance-of v0, p0, Ljava/lang/reflect/GenericArrayType; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 9 */
/* check-cast p0, Ljava/lang/reflect/GenericArrayType; */
/* .line 10 */
e.f.d.d0.e .f ( p0 );
java.lang.reflect.Array .newInstance ( p0,v1 );
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 11 */
} // :cond_2
/* instance-of v0, p0, Ljava/lang/reflect/TypeVariable; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 12 */
/* const-class p0, Ljava/lang/Object; */
/* .line 13 */
} // :cond_3
/* instance-of v0, p0, Ljava/lang/reflect/WildcardType; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 14 */
/* check-cast p0, Ljava/lang/reflect/WildcardType; */
/* aget-object p0, p0, v1 */
e.f.d.d0.e .f ( p0 );
} // :cond_4
/* if-nez p0, :cond_5 */
final String v0 = "null"; // const-string v0, "null"
/* .line 15 */
} // :cond_5
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
/* .line 16 */
} // :goto_0
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"; // const-string v3, "Expected a Class, ParameterizedType, or GenericArrayType, but <"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p0 = "> is of type "; // const-string p0, "> is of type "
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // .end method
public static java.lang.reflect.WildcardType g ( java.lang.reflect.Type p0 ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Le/f/d/d0/d; */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/reflect/Type; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p0, v1, v2 */
p0 = e.f.d.d0.e.a;
/* invoke-direct {v0, v1, p0}, Le/f/d/d0/d;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V */
} // .end method
public static java.lang.reflect.WildcardType h ( java.lang.reflect.Type p0 ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Le/f/d/d0/d; */
int v1 = 1; // const/4 v1, 0x1
/* new-array v2, v1, [Ljava/lang/reflect/Type; */
/* const-class v3, Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v3, v2, v4 */
/* new-array v1, v1, [Ljava/lang/reflect/Type; */
/* aput-object p0, v1, v4 */
/* invoke-direct {v0, v2, v1}, Le/f/d/d0/d;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V */
} // .end method
public static java.lang.String i ( java.lang.reflect.Type p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p0, Ljava/lang/Class; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p0, Ljava/lang/Class; */
(( java.lang.Class ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;
} // :cond_0
(( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // :goto_0
} // .end method
