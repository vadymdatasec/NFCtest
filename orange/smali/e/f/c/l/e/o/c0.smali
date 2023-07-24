.class public final Le/f/c/l/e/o/c0;
.super Le/f/c/l/e/o/e2;
.source "SourceFile"


# instance fields
.field public a:Le/f/c/l/e/o/p3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/g2;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/c/l/e/o/e2;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/e2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/o/p3<",
            "Le/f/c/l/e/o/g2;",
            ">;)",
            "Le/f/c/l/e/o/e2;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/o/c0;->a:Le/f/c/l/e/o/p3;

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null files"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;)Le/f/c/l/e/o/e2;
    .locals 0

    .line 3
    iput-object p1, p0, Le/f/c/l/e/o/c0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public a()Le/f/c/l/e/o/h2;
    .locals 4

    .line 4
    iget-object v0, p0, Le/f/c/l/e/o/c0;->a:Le/f/c/l/e/o/p3;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " files"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 6
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    new-instance v0, Le/f/c/l/e/o/d0;

    iget-object v1, p0, Le/f/c/l/e/o/c0;->a:Le/f/c/l/e/o/p3;

    iget-object v2, p0, Le/f/c/l/e/o/c0;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Le/f/c/l/e/o/d0;-><init>(Le/f/c/l/e/o/p3;Ljava/lang/String;Le/f/c/l/e/o/b0;)V

    return-object v0

    .line 8
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
