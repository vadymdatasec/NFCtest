.class public final Le/f/e/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/b;

.field public b:Le/f/e/o/b;


# direct methods
.method public constructor <init>(Le/f/e/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    iput-object p1, p0, Le/f/e/c;->a:Le/f/e/b;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Binarizer must be non-null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(ILe/f/e/o/a;)Le/f/e/o/a;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/e/c;->a:Le/f/e/b;

    invoke-virtual {v0, p1, p2}, Le/f/e/b;->a(ILe/f/e/o/a;)Le/f/e/o/a;

    move-result-object p1

    return-object p1
.end method

.method public a()Le/f/e/o/b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/e/c;->b:Le/f/e/o/b;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Le/f/e/c;->a:Le/f/e/b;

    invoke-virtual {v0}, Le/f/e/b;->a()Le/f/e/o/b;

    move-result-object v0

    iput-object v0, p0, Le/f/e/c;->b:Le/f/e/o/b;

    .line 4
    :cond_0
    iget-object v0, p0, Le/f/e/c;->b:Le/f/e/o/b;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/c;->a:Le/f/e/b;

    invoke-virtual {v0}, Le/f/e/b;->b()I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/c;->a:Le/f/e/b;

    invoke-virtual {v0}, Le/f/e/b;->d()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/c;->a:Le/f/e/b;

    invoke-virtual {v0}, Le/f/e/b;->c()Le/f/e/f;

    move-result-object v0

    invoke-virtual {v0}, Le/f/e/f;->e()Z

    move-result v0

    return v0
.end method

.method public e()Le/f/e/c;
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/e/c;->a:Le/f/e/b;

    invoke-virtual {v0}, Le/f/e/b;->c()Le/f/e/f;

    move-result-object v0

    invoke-virtual {v0}, Le/f/e/f;->f()Le/f/e/f;

    move-result-object v0

    .line 2
    new-instance v1, Le/f/e/c;

    iget-object v2, p0, Le/f/e/c;->a:Le/f/e/b;

    invoke-virtual {v2, v0}, Le/f/e/b;->a(Le/f/e/f;)Le/f/e/b;

    move-result-object v0

    invoke-direct {v1, v0}, Le/f/e/c;-><init>(Le/f/e/b;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Le/f/e/c;->a()Le/f/e/o/b;

    move-result-object v0

    invoke-virtual {v0}, Le/f/e/o/b;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method
