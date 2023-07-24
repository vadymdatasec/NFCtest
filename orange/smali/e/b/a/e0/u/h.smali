.class public abstract Le/b/a/e0/u/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/b/a/e0/u/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/e0/u/g<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/e0/u/a;

    invoke-direct {v0}, Le/b/a/e0/u/a;-><init>()V

    sput-object v0, Le/b/a/e0/u/h;->a:Le/b/a/e0/u/g;

    return-void
.end method

.method public static a(I)Lc/h/m/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lc/h/m/f;

    invoke-direct {v0, p0}, Lc/h/m/f;-><init>(I)V

    new-instance p0, Le/b/a/e0/u/b;

    invoke-direct {p0}, Le/b/a/e0/u/b;-><init>()V

    new-instance v1, Le/b/a/e0/u/c;

    invoke-direct {v1}, Le/b/a/e0/u/c;-><init>()V

    invoke-static {v0, p0, v1}, Le/b/a/e0/u/h;->a(Lc/h/m/d;Le/b/a/e0/u/d;Le/b/a/e0/u/g;)Lc/h/m/d;

    move-result-object p0

    return-object p0
.end method

.method public static a(ILe/b/a/e0/u/d;)Lc/h/m/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Le/b/a/e0/u/f;",
            ">(I",
            "Le/b/a/e0/u/d<",
            "TT;>;)",
            "Lc/h/m/d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/h/m/f;

    invoke-direct {v0, p0}, Lc/h/m/f;-><init>(I)V

    invoke-static {v0, p1}, Le/b/a/e0/u/h;->a(Lc/h/m/d;Le/b/a/e0/u/d;)Lc/h/m/d;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lc/h/m/d;Le/b/a/e0/u/d;)Lc/h/m/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Le/b/a/e0/u/f;",
            ">(",
            "Lc/h/m/d<",
            "TT;>;",
            "Le/b/a/e0/u/d<",
            "TT;>;)",
            "Lc/h/m/d<",
            "TT;>;"
        }
    .end annotation

    .line 3
    invoke-static {}, Le/b/a/e0/u/h;->a()Le/b/a/e0/u/g;

    move-result-object v0

    invoke-static {p0, p1, v0}, Le/b/a/e0/u/h;->a(Lc/h/m/d;Le/b/a/e0/u/d;Le/b/a/e0/u/g;)Lc/h/m/d;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lc/h/m/d;Le/b/a/e0/u/d;Le/b/a/e0/u/g;)Lc/h/m/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/h/m/d<",
            "TT;>;",
            "Le/b/a/e0/u/d<",
            "TT;>;",
            "Le/b/a/e0/u/g<",
            "TT;>;)",
            "Lc/h/m/d<",
            "TT;>;"
        }
    .end annotation

    .line 4
    new-instance v0, Le/b/a/e0/u/e;

    invoke-direct {v0, p0, p1, p2}, Le/b/a/e0/u/e;-><init>(Lc/h/m/d;Le/b/a/e0/u/d;Le/b/a/e0/u/g;)V

    return-object v0
.end method

.method public static a()Le/b/a/e0/u/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Le/b/a/e0/u/g<",
            "TT;>;"
        }
    .end annotation

    .line 5
    sget-object v0, Le/b/a/e0/u/h;->a:Le/b/a/e0/u/g;

    return-object v0
.end method

.method public static b()Lc/h/m/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    const/16 v0, 0x14

    .line 1
    invoke-static {v0}, Le/b/a/e0/u/h;->a(I)Lc/h/m/d;

    move-result-object v0

    return-object v0
.end method
