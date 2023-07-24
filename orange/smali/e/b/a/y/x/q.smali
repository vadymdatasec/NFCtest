.class public Le/b/a/y/x/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Le/b/a/y/n;

.field public b:Le/b/a/y/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/u<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public c:Le/b/a/y/x/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/x0<",
            "TZ;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Le/b/a/y/x/q;->a:Le/b/a/y/n;

    .line 13
    iput-object v0, p0, Le/b/a/y/x/q;->b:Le/b/a/y/u;

    .line 14
    iput-object v0, p0, Le/b/a/y/x/q;->c:Le/b/a/y/x/x0;

    return-void
.end method

.method public a(Le/b/a/y/n;Le/b/a/y/u;Le/b/a/y/x/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/n;",
            "Le/b/a/y/u<",
            "TX;>;",
            "Le/b/a/y/x/x0<",
            "TX;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le/b/a/y/x/q;->a:Le/b/a/y/n;

    .line 2
    iput-object p2, p0, Le/b/a/y/x/q;->b:Le/b/a/y/u;

    .line 3
    iput-object p3, p0, Le/b/a/y/x/q;->c:Le/b/a/y/x/x0;

    return-void
.end method

.method public a(Le/b/a/y/x/r;Le/b/a/y/r;)V
    .locals 4

    const-string v0, "DecodeJob.encode"

    .line 4
    invoke-static {v0}, Le/b/a/e0/u/i;->a(Ljava/lang/String;)V

    .line 5
    :try_start_0
    invoke-interface {p1}, Le/b/a/y/x/r;->a()Le/b/a/y/x/g1/c;

    move-result-object p1

    iget-object v0, p0, Le/b/a/y/x/q;->a:Le/b/a/y/n;

    new-instance v1, Le/b/a/y/x/j;

    iget-object v2, p0, Le/b/a/y/x/q;->b:Le/b/a/y/u;

    iget-object v3, p0, Le/b/a/y/x/q;->c:Le/b/a/y/x/x0;

    invoke-direct {v1, v2, v3, p2}, Le/b/a/y/x/j;-><init>(Le/b/a/y/d;Ljava/lang/Object;Le/b/a/y/r;)V

    .line 6
    invoke-interface {p1, v0, v1}, Le/b/a/y/x/g1/c;->a(Le/b/a/y/n;Le/b/a/y/x/g1/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object p1, p0, Le/b/a/y/x/q;->c:Le/b/a/y/x/x0;

    invoke-virtual {p1}, Le/b/a/y/x/x0;->f()V

    .line 8
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return-void

    :catchall_0
    move-exception p1

    .line 9
    iget-object p2, p0, Le/b/a/y/x/q;->c:Le/b/a/y/x/x0;

    invoke-virtual {p2}, Le/b/a/y/x/x0;->f()V

    .line 10
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    .line 11
    throw p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/q;->c:Le/b/a/y/x/x0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
