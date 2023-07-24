.class public final Le/f/a/a/j/l0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf/a/b<",
        "Le/f/a/a/j/l0/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Le/f/a/a/j/l0/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/j/l0/c;

    invoke-direct {v0}, Le/f/a/a/j/l0/c;-><init>()V

    sput-object v0, Le/f/a/a/j/l0/c;->a:Le/f/a/a/j/l0/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/a/a/j/l0/c;
    .locals 1

    .line 1
    sget-object v0, Le/f/a/a/j/l0/c;->a:Le/f/a/a/j/l0/c;

    return-object v0
.end method

.method public static b()Le/f/a/a/j/l0/a;
    .locals 2

    .line 1
    invoke-static {}, Le/f/a/a/j/l0/b;->a()Le/f/a/a/j/l0/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lf/a/d;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Le/f/a/a/j/l0/a;

    return-object v0
.end method


# virtual methods
.method public get()Le/f/a/a/j/l0/a;
    .locals 1

    .line 2
    invoke-static {}, Le/f/a/a/j/l0/c;->b()Le/f/a/a/j/l0/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/l0/c;->get()Le/f/a/a/j/l0/a;

    move-result-object v0

    return-object v0
.end method
