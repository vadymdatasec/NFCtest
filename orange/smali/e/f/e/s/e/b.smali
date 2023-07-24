.class public final Le/f/e/s/e/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/o/b;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[",
            "Le/f/e/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/e/o/b;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/e/o/b;",
            "Ljava/util/List<",
            "[",
            "Le/f/e/l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/e/s/e/b;->a:Le/f/e/o/b;

    .line 3
    iput-object p2, p0, Le/f/e/s/e/b;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Le/f/e/o/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/e/s/e/b;->a:Le/f/e/o/b;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[",
            "Le/f/e/l;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/e/s/e/b;->b:Ljava/util/List;

    return-object v0
.end method
