.class public final synthetic Le/f/c/k/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/r/a;


# static fields
.field public static final a:Le/f/c/k/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/k/o;

    invoke-direct {v0}, Le/f/c/k/o;-><init>()V

    sput-object v0, Le/f/c/k/o;->a:Le/f/c/k/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/c/r/a;
    .locals 1

    sget-object v0, Le/f/c/k/o;->a:Le/f/c/k/o;

    return-object v0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
