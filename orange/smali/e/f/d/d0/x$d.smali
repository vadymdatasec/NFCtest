.class public final Le/f/d/d0/x$d;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/d/d0/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractCollection<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Le/f/d/d0/x;


# direct methods
.method public constructor <init>(Le/f/d/d0/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/d/d0/x$d;->b:Le/f/d/d0/x;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le/f/d/d0/x;Le/f/d/d0/v;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Le/f/d/d0/x$d;-><init>(Le/f/d/d0/x;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$d;->b:Le/f/d/d0/x;

    invoke-virtual {v0}, Le/f/d/d0/x;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$d;->b:Le/f/d/d0/x;

    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/d/d0/a0;

    invoke-direct {v0, p0}, Le/f/d/d0/a0;-><init>(Le/f/d/d0/x$d;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$d;->b:Le/f/d/d0/x;

    invoke-static {v0}, Le/f/d/d0/x;->b(Le/f/d/d0/x;)I

    move-result v0

    return v0
.end method
