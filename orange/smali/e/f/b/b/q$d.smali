.class public final Le/f/b/b/q$d;
.super Le/f/b/b/q$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/b/b/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/b/b/q<",
        "TK;TV;TE;TS;>.c<TK;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Le/f/b/b/q;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/b/b/q$c;-><init>(Le/f/b/b/q;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/b/b/q$c;->b()Le/f/b/b/q$h;

    move-result-object v0

    invoke-virtual {v0}, Le/f/b/b/q$h;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
