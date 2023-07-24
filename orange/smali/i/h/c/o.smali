.class public Li/h/c/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Li/j/b;
    .locals 1

    .line 2
    new-instance v0, Li/h/c/e;

    invoke-direct {v0, p1}, Li/h/c/e;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public a(Ljava/lang/Class;Ljava/lang/String;)Li/j/c;
    .locals 1

    .line 1
    new-instance v0, Li/h/c/m;

    invoke-direct {v0, p1, p2}, Li/h/c/m;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public a(Li/h/c/i;)Li/j/d;
    .locals 0

    return-object p1
.end method

.method public a(Li/h/c/h;)Ljava/lang/String;
    .locals 1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "kotlin.jvm.functions."

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public a(Li/h/c/l;)Ljava/lang/String;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Li/h/c/o;->a(Li/h/c/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
