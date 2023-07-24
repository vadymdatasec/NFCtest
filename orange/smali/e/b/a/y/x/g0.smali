.class public Le/b/a/y/x/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/b/a/y/x/h1/k;

.field public final b:Le/b/a/y/x/h1/k;

.field public final c:Le/b/a/y/x/h1/k;

.field public final d:Le/b/a/y/x/h1/k;

.field public final e:Le/b/a/y/x/o0;

.field public final f:Le/b/a/y/x/r0;

.field public final g:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Le/b/a/y/x/k0<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/o0;Le/b/a/y/x/r0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/x/f0;

    invoke-direct {v0, p0}, Le/b/a/y/x/f0;-><init>(Le/b/a/y/x/g0;)V

    const/16 v1, 0x96

    .line 3
    invoke-static {v1, v0}, Le/b/a/e0/u/h;->a(ILe/b/a/e0/u/d;)Lc/h/m/d;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/g0;->g:Lc/h/m/d;

    .line 4
    iput-object p1, p0, Le/b/a/y/x/g0;->a:Le/b/a/y/x/h1/k;

    .line 5
    iput-object p2, p0, Le/b/a/y/x/g0;->b:Le/b/a/y/x/h1/k;

    .line 6
    iput-object p3, p0, Le/b/a/y/x/g0;->c:Le/b/a/y/x/h1/k;

    .line 7
    iput-object p4, p0, Le/b/a/y/x/g0;->d:Le/b/a/y/x/h1/k;

    .line 8
    iput-object p5, p0, Le/b/a/y/x/g0;->e:Le/b/a/y/x/o0;

    .line 9
    iput-object p6, p0, Le/b/a/y/x/g0;->f:Le/b/a/y/x/r0;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/n;ZZZZ)Le/b/a/y/x/k0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/n;",
            "ZZZZ)",
            "Le/b/a/y/x/k0<",
            "TR;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/g0;->g:Lc/h/m/d;

    invoke-interface {v0}, Lc/h/m/d;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/x/k0;

    invoke-static {v0}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Le/b/a/y/x/k0;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 2
    invoke-virtual/range {v1 .. v6}, Le/b/a/y/x/k0;->a(Le/b/a/y/n;ZZZZ)Le/b/a/y/x/k0;

    return-object v0
.end method
