.class public Le/f/c/s/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/s/r;


# instance fields
.field public final a:Le/f/a/b/h/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/a/b/h/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/h/h<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/s/n;->a:Le/f/a/b/h/h;

    return-void
.end method


# virtual methods
.method public a(Le/f/c/s/t/h;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Le/f/c/s/t/h;->k()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    invoke-virtual {p1}, Le/f/c/s/t/h;->j()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p1}, Le/f/c/s/t/h;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Le/f/c/s/n;->a:Le/f/a/b/h/h;

    invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public a(Le/f/c/s/t/h;Ljava/lang/Exception;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
