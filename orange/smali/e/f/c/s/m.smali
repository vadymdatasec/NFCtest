.class public Le/f/c/s/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/s/r;


# instance fields
.field public final a:Le/f/c/s/s;

.field public final b:Le/f/a/b/h/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/h<",
            "Le/f/c/s/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/c/s/s;Le/f/a/b/h/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/s/s;",
            "Le/f/a/b/h/h<",
            "Le/f/c/s/p;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/s/m;->a:Le/f/c/s/s;

    .line 3
    iput-object p2, p0, Le/f/c/s/m;->b:Le/f/a/b/h/h;

    return-void
.end method


# virtual methods
.method public a(Le/f/c/s/t/h;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Le/f/c/s/t/h;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/c/s/m;->a:Le/f/c/s/s;

    .line 2
    invoke-virtual {v0, p1}, Le/f/c/s/s;->a(Le/f/c/s/t/h;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Le/f/c/s/m;->b:Le/f/a/b/h/h;

    .line 4
    invoke-static {}, Le/f/c/s/p;->d()Le/f/c/s/o;

    move-result-object v1

    .line 5
    invoke-virtual {p1}, Le/f/c/s/t/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/s/o;->a(Ljava/lang/String;)Le/f/c/s/o;

    .line 6
    invoke-virtual {p1}, Le/f/c/s/t/h;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Le/f/c/s/o;->b(J)Le/f/c/s/o;

    .line 7
    invoke-virtual {p1}, Le/f/c/s/t/h;->g()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Le/f/c/s/o;->a(J)Le/f/c/s/o;

    .line 8
    invoke-virtual {v1}, Le/f/c/s/o;->a()Le/f/c/s/p;

    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public a(Le/f/c/s/t/h;Ljava/lang/Exception;)Z
    .locals 1

    .line 10
    invoke-virtual {p1}, Le/f/c/s/t/h;->h()Z

    move-result v0

    if-nez v0, :cond_1

    .line 11
    invoke-virtual {p1}, Le/f/c/s/t/h;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 12
    invoke-virtual {p1}, Le/f/c/s/t/h;->k()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 13
    :cond_1
    :goto_0
    iget-object p1, p0, Le/f/c/s/m;->b:Le/f/a/b/h/h;

    invoke-virtual {p1, p2}, Le/f/a/b/h/h;->b(Ljava/lang/Exception;)Z

    const/4 p1, 0x1

    return p1
.end method
