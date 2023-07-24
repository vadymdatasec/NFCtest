.class public final Le/f/a/d/a/b/p;
.super Le/f/a/d/a/b/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/a/d/a/b/l<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final synthetic f:Le/f/a/d/a/b/q;


# direct methods
.method public constructor <init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/o<",
            "Ljava/lang/Void;",
            ">;I",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Le/f/a/d/a/b/p;->f:Le/f/a/d/a/b/q;

    invoke-direct {p0, p1, p2}, Le/f/a/d/a/b/l;-><init>(Le/f/a/d/a/b/q;Le/f/a/d/a/i/o;)V

    iput p3, p0, Le/f/a/d/a/b/p;->c:I

    iput-object p4, p0, Le/f/a/d/a/b/p;->d:Ljava/lang/String;

    iput p5, p0, Le/f/a/d/a/b/p;->e:I

    return-void
.end method


# virtual methods
.method public final c(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/b/p;->f:Le/f/a/d/a/b/q;

    invoke-static {v0}, Le/f/a/d/a/b/q;->b(Le/f/a/d/a/b/q;)Le/f/a/d/a/e/k;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/d/a/e/k;->a()V

    const-string v0, "error_code"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {}, Le/f/a/d/a/b/q;->c()Le/f/a/d/a/e/a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "onError(%d), retrying notifyModuleCompleted..."

    invoke-virtual {v0, p1, v1}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget p1, p0, Le/f/a/d/a/b/p;->e:I

    if-lez p1, :cond_0

    iget-object v0, p0, Le/f/a/d/a/b/p;->f:Le/f/a/d/a/b/q;

    iget v1, p0, Le/f/a/d/a/b/p;->c:I

    iget-object v2, p0, Le/f/a/d/a/b/p;->d:Ljava/lang/String;

    add-int/lit8 p1, p1, -0x1

    invoke-static {v0, v1, v2, p1}, Le/f/a/d/a/b/q;->a(Le/f/a/d/a/b/q;ILjava/lang/String;I)V

    :cond_0
    return-void
.end method
