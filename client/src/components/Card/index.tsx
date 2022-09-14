import React from 'react';
import * as S from './style';

type Props = {
  children: React.ReactNode;
};

const Card: React.FC<Props> = ({ children }) => {
  return <S.CardWrapper>{children}</S.CardWrapper>;
};

export default Card;
