.class public Le/f/d/d0/g0/j0;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/d/a0<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/d/a0;


# direct methods
.method public constructor <init>(Le/f/d/d0/g0/k0;Le/f/d/a0;)V
    .locals 0

    .line 1
    iput-object p2, p0, Le/f/d/d0/g0/j0;->a:Le/f/d/a0;

    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/f/d/d0/g0/j0;->a(Le/f/d/f0/c;)Ljava/sql/Timestamp;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/d/f0/c;)Ljava/sql/Timestamp;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/f/d/d0/g0/j0;->a:Le/f/d/a0;

    invoke-virtual {v0, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    .line 4
    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Le/f/d/d0/g0/j0;->a(Le/f/d/f0/g;Ljava/sql/Timestamp;)V

    return-void
.end method

.method public a(Le/f/d/f0/g;Ljava/sql/Timestamp;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    iget-object v0, p0, Le/f/d/d0/g0/j0;->a:Le/f/d/a0;

    invoke-virtual {v0, p1, p2}, Le/f/d/a0;->a(Le/f/d/f0/g;Ljava/lang/Object;)V

    return-void
.end method
