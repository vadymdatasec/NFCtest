.class public Le/f/b/b/g$a;
.super Le/f/b/b/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/b/b/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/b/b/g<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient d:I

.field public final transient e:I

.field public final synthetic f:Le/f/b/b/g;


# direct methods
.method public constructor <init>(Le/f/b/b/g;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/b/b/g$a;->f:Le/f/b/b/g;

    invoke-direct {p0}, Le/f/b/b/g;-><init>()V

    .line 2
    iput p2, p0, Le/f/b/b/g$a;->d:I

    .line 3
    iput p3, p0, Le/f/b/b/g$a;->e:I

    return-void
.end method


# virtual methods
.method public a()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/g$a;->f:Le/f/b/b/g;

    invoke-virtual {v0}, Le/f/b/b/e;->a()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/b/b/g$a;->f:Le/f/b/b/g;

    invoke-virtual {v0}, Le/f/b/b/e;->c()I

    move-result v0

    iget v1, p0, Le/f/b/b/g$a;->d:I

    add-int/2addr v0, v1

    iget v1, p0, Le/f/b/b/g$a;->e:I

    add-int/2addr v0, v1

    return v0
.end method

.method public c()I
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/b/b/g$a;->f:Le/f/b/b/g;

    invoke-virtual {v0}, Le/f/b/b/e;->c()I

    move-result v0

    iget v1, p0, Le/f/b/b/g$a;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    iget v0, p0, Le/f/b/b/g$a;->e:I

    invoke-static {p1, v0}, Le/f/b/a/p;->a(II)I

    .line 2
    iget-object v0, p0, Le/f/b/b/g$a;->f:Le/f/b/b/g;

    iget v1, p0, Le/f/b/b/g$a;->d:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-super {p0}, Le/f/b/b/g;->iterator()Le/f/b/b/u0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-super {p0}, Le/f/b/b/g;->listIterator()Le/f/b/b/v0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Le/f/b/b/g;->listIterator(I)Le/f/b/b/v0;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/b/b/g$a;->e:I

    return v0
.end method

.method public subList(II)Le/f/b/b/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 2
    iget v0, p0, Le/f/b/b/g$a;->e:I

    invoke-static {p1, p2, v0}, Le/f/b/a/p;->b(III)V

    .line 3
    iget-object v0, p0, Le/f/b/b/g$a;->f:Le/f/b/b/g;

    iget v1, p0, Le/f/b/b/g$a;->d:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Le/f/b/b/g;->subList(II)Le/f/b/b/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Le/f/b/b/g$a;->subList(II)Le/f/b/b/g;

    move-result-object p1

    return-object p1
.end method
