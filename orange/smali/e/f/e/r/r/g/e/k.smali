.class public final Le/f/e/r/r/g/e/k;
.super Le/f/e/r/r/g/e/j;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le/f/e/o/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/e/r/r/g/e/j;-><init>(Le/f/e/o/a;)V

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {p0}, Le/f/e/r/r/g/e/j;->a()Le/f/e/r/r/g/e/t;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v0, v2}, Le/f/e/r/r/g/e/t;->a(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
