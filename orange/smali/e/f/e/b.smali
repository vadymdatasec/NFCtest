.class public abstract Le/f/e/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/f;


# direct methods
.method public constructor <init>(Le/f/e/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/e/b;->a:Le/f/e/f;

    return-void
.end method


# virtual methods
.method public abstract a(Le/f/e/f;)Le/f/e/b;
.end method

.method public abstract a(ILe/f/e/o/a;)Le/f/e/o/a;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation
.end method

.method public abstract a()Le/f/e/o/b;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/b;->a:Le/f/e/f;

    invoke-virtual {v0}, Le/f/e/f;->a()I

    move-result v0

    return v0
.end method

.method public final c()Le/f/e/f;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/b;->a:Le/f/e/f;

    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/b;->a:Le/f/e/f;

    invoke-virtual {v0}, Le/f/e/f;->c()I

    move-result v0

    return v0
.end method
