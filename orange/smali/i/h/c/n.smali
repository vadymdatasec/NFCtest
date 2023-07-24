.class public abstract Li/h/c/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Li/h/c/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li/h/c/o;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    new-instance v0, Li/h/c/o;

    invoke-direct {v0}, Li/h/c/o;-><init>()V

    :goto_1
    sput-object v0, Li/h/c/n;->a:Li/h/c/o;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Li/j/b;
    .locals 1

    .line 1
    sget-object v0, Li/h/c/n;->a:Li/h/c/o;

    invoke-virtual {v0, p0}, Li/h/c/o;->a(Ljava/lang/Class;)Li/j/b;

    move-result-object p0

    return-object p0
.end method

.method public static a(Li/h/c/i;)Li/j/d;
    .locals 1

    .line 3
    sget-object v0, Li/h/c/n;->a:Li/h/c/o;

    invoke-virtual {v0, p0}, Li/h/c/o;->a(Li/h/c/i;)Li/j/d;

    return-object p0
.end method

.method public static a(Li/h/c/l;)Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Li/h/c/n;->a:Li/h/c/o;

    invoke-virtual {v0, p0}, Li/h/c/o;->a(Li/h/c/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Li/j/c;
    .locals 2

    .line 1
    sget-object v0, Li/h/c/n;->a:Li/h/c/o;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Li/h/c/o;->a(Ljava/lang/Class;Ljava/lang/String;)Li/j/c;

    move-result-object p0

    return-object p0
.end method
