.class public Le/f/b/b/f;
.super Le/f/b/b/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/a<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final d:Le/f/b/b/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/b/b/g;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/g<",
            "TE;>;I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Le/f/b/b/a;-><init>(II)V

    .line 2
    iput-object p1, p0, Le/f/b/b/f;->d:Le/f/b/b/g;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/f;->d:Le/f/b/b/g;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
