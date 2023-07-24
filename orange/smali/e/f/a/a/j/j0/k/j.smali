.class public final Le/f/a/a/j/j0/k/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf/a/b<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/a/a/j/j0/k/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/j/j0/k/j;

    invoke-direct {v0}, Le/f/a/a/j/j0/k/j;-><init>()V

    sput-object v0, Le/f/a/a/j/j0/k/j;->a:Le/f/a/a/j/j0/k/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/a/a/j/j0/k/j;
    .locals 1

    .line 1
    sget-object v0, Le/f/a/a/j/j0/k/j;->a:Le/f/a/a/j/j0/k/j;

    return-object v0
.end method

.method public static b()I
    .locals 1

    .line 1
    invoke-static {}, Le/f/a/a/j/j0/k/h;->b()I

    move-result v0

    return v0
.end method


# virtual methods
.method public get()Ljava/lang/Integer;
    .locals 1

    .line 2
    invoke-static {}, Le/f/a/a/j/j0/k/j;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/j0/k/j;->get()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
