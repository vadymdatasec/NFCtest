.class public Le/b/a/y/y/d2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/y/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/y/w0<",
        "Le/b/a/y/y/i0;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Le/b/a/y/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/q<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Le/b/a/y/y/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/u0<",
            "Le/b/a/y/y/i0;",
            "Le/b/a/y/y/i0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9c4

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"

    invoke-static {v1, v0}, Le/b/a/y/q;->a(Ljava/lang/String;Ljava/lang/Object;)Le/b/a/y/q;

    move-result-object v0

    sput-object v0, Le/b/a/y/y/d2/b;->b:Le/b/a/y/q;

    return-void
.end method

.method public constructor <init>(Le/b/a/y/y/u0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/u0<",
            "Le/b/a/y/y/i0;",
            "Le/b/a/y/y/i0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/y/d2/b;->a:Le/b/a/y/y/u0;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/y/i0;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/y/i0;",
            "II",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/y/v0<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object p2, p0, Le/b/a/y/y/d2/b;->a:Le/b/a/y/y/u0;

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    .line 4
    invoke-virtual {p2, p1, p3, p3}, Le/b/a/y/y/u0;->a(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/b/a/y/y/i0;

    if-nez p2, :cond_0

    .line 5
    iget-object p2, p0, Le/b/a/y/y/d2/b;->a:Le/b/a/y/y/u0;

    invoke-virtual {p2, p1, p3, p3, p1}, Le/b/a/y/y/u0;->a(Ljava/lang/Object;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p1, p2

    .line 6
    :cond_1
    :goto_0
    sget-object p2, Le/b/a/y/y/d2/b;->b:Le/b/a/y/q;

    invoke-virtual {p4, p2}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 7
    new-instance p3, Le/b/a/y/y/v0;

    new-instance p4, Le/b/a/y/w/p;

    invoke-direct {p4, p1, p2}, Le/b/a/y/w/p;-><init>(Le/b/a/y/y/i0;I)V

    invoke-direct {p3, p1, p4}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V

    return-object p3
.end method

.method public bridge synthetic a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;
    .locals 0

    .line 1
    check-cast p1, Le/b/a/y/y/i0;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/d2/b;->a(Le/b/a/y/y/i0;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/b/a/y/y/i0;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 2
    check-cast p1, Le/b/a/y/y/i0;

    invoke-virtual {p0, p1}, Le/b/a/y/y/d2/b;->a(Le/b/a/y/y/i0;)Z

    move-result p1

    return p1
.end method
