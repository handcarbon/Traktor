export interface FolderTree {
  id: number;
  name: string;
  folders: FolderTree[];
  requests: RequestTree[];
}

export interface RequestTree {
  id: number;
  name: string;
  method: string;
}
